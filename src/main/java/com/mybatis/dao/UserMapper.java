package com.mybatis.dao;

import com.mybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper{

   List<User> getUser();

   User getById(@Param("id")Integer id);

  int update(User user);
}
