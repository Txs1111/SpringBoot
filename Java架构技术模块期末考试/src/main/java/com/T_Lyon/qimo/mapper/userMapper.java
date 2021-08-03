package com.T_Lyon.qimo.mapper;


import com.T_Lyon.qimo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface userMapper {
    List<User> getUser();
}
