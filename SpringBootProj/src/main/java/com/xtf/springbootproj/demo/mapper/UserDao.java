package com.xtf.springbootproj.demo.mapper;

import com.xtf.springbootproj.demo.model.User;
import org.apache.ibatis.annotations.Param;
import java.util.List;



public interface UserDao {

    List<User> login(@Param("name") String name, @Param("password")String password);
}
