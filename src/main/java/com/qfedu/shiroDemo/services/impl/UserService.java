package com.qfedu.shiroDemo.services.impl;

import com.qfedu.shiroDemo.services.IUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {


    public void login(String userName,String userPwd) throws  Exception{
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(userName,userPwd);
        subject.login(token);
    }
}
