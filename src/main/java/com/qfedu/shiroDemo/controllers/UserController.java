package com.qfedu.shiroDemo.controllers;

import com.qfedu.shiroDemo.services.impl.UserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login.do")
    public String  login(String userName, String userPwd, Model model){
        try{
            userService.login(userName,userPwd);
            return "index.jsp";
        }catch (Exception e){
            model.addAttribute("code","登录验证失败，请重试！");
            return "login.jsp";
        }
    }


    @RequestMapping("aa.do")
    @RequiresPermissions("sys:x:save")
    public void test(){
        System.out.println("aaa");
    }
}
