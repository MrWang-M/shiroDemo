package com.qfedu.shiroDemo.handler;


import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler
    public ModelAndView doException(Exception e){
        ModelAndView view = new ModelAndView();
        if(e instanceof UnauthorizedException){
            view.addObject("msg","没有权限点你吗呢！");
        }else{
            view.addObject("msg","成文明是个憨批！");
        }
        view.setViewName("aaa.jsp");
        return view;
    }
}
