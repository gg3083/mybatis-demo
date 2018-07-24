package com.mybatis.controller;

import com.mybatis.dao.UserMapper;
import com.mybatis.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/")
    public String index( HttpServletRequest request) {
        request.setAttribute("user","hh");
        return "index";
    }

    @RequestMapping("list")
    @ResponseBody
    public Object list(){
        HashMap map = new HashMap();
        map.put("user",userMapper.getUser());
        return map;
    }

}