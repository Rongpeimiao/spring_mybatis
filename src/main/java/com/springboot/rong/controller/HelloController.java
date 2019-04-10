package com.springboot.rong.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rong.entity.UserDTO;
import com.springboot.rong.service.UserService;

/**
 * 测试控制器
 */
@RestController
public class HelloController {

	 @Resource
	 private UserService userService;
	
    @RequestMapping("/hello")
    public String hello() {
        return "Hello Spring Boot!";
    }
    
    @RequestMapping("/showUser")
    public UserDTO toIndex(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        UserDTO user = this.userService.getUserById(userId);
        return user;
    }
}