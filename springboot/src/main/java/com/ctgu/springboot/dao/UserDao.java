package com.ctgu.springboot.dao;

import com.ctgu.springboot.pojo.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserDao {

    /**
     * 根据用户名称，查询用户信息
     *
     * @param username 用户名
     */
    @Select("SELECT * FROM USER where username = #{username}")
//    @Select("SELECT * FROM USER")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "username", column = "username"),
            @Result(property = "age", column = "age"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "email", column = "email"),
    })
    User findByName(String username);
//    User findByName(@Param("username") String username);
}
