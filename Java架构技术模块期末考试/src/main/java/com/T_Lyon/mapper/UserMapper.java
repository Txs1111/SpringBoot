package com.T_Lyon.mapper;

import com.T_Lyon.pojo.User;
import org.apache.ibatis.annotations.Select;

/**
 * @author Lyon
 * 2021-5-23 14:23:54
 */
public interface UserMapper {

    /**
     * 根据id查找用户
     *
     * @param id
     * @return
     */
    @Select("select * from xgq_exam.user where id = #{id}")
    User getUserByID(int id);
}
