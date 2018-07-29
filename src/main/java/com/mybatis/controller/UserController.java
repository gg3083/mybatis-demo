package com.mybatis.controller;

import com.mybatis.dao.UserMapper;
import com.mybatis.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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
    public String index(HttpServletRequest request) {
        //request.setAttribute("user","hh");
        return "index";
    }

    @RequestMapping("list")
    @ResponseBody
    public Object list() {
        HashMap map = new HashMap();
        map.put("user", userMapper.getUser());
        return map;
    }

    @RequestMapping("toupdate/{pkUserId}")
    public String toupdate(@PathVariable("pkUserId") Integer pkUserId, HttpServletRequest request) {
        request.setAttribute("user", userMapper.getById(pkUserId));
        return "update";
    }

    @RequestMapping("update")
    public Object update(User user, HttpServletRequest request) {
        int i = userMapper.update(user);
        if (i == 1){
            return index(request);
        }
        return "404";
    }

}