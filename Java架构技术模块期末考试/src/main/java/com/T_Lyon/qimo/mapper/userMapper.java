package com.T_Lyon.qimo.mapper;


import com.T_Lyon.qimo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface userMapper {
    User getUser();
}
