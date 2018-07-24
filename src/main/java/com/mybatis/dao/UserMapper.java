package com.mybatis.dao;

import com.mybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper{

   List<User> getUser();
}
