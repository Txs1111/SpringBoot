package com.T_Lyon.qimo.config;


import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/my/login").permitAll()
                .antMatchers("/admin/self").hasRole("admin")
                .antMatchers("/user/self").hasRole("user");

        http.formLogin()
                .usernameParameter("username")
                .passwordParameter("password")
                .loginPage("/my/login")
                .failureUrl("/my/error")
                .loginProcessingUrl("/login");

        http.rememberMe();


        http.logout().logoutSuccessUrl("/my/logout");

        http.csrf().disable();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
                .withUser("user").password(new BCryptPasswordEncoder().encode("1")).roles("user")
                .and()
                .withUser("admin").password(new BCryptPasswordEncoder().encode("1")).roles("admin", "user");
    }
}
