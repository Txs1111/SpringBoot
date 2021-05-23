package com.T_Lyon.pojo;

import lombok.*;

/**
 * @author Lyon
 * 2021-5-23 14:21:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String password;
}
