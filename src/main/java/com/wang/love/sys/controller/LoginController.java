package com.wang.love.sys.controller;

import com.wang.love.sys.entity.User;
import com.wang.love.sys.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**登录控制器
 * @author wang
 */
@Controller
@RequestMapping("/sys")
public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping("/login")
    public String login(String username,String password){
        System.out.println("====进入登录的方法====");
        return loginService.sysLogin(username,password)?"index":"error";
    }

    @GetMapping("/loginPage")
    public String pageLogin(){
        return "login";
    }
}
