package com.hito.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login(HttpSession session,String username, String password){
        //把用户信息存在session中
        session.setAttribute("userLoginInfo",username);
        return "main";
    }

    @RequestMapping("/main")
    public String main(){
        return "main";
    }

    @RequestMapping("/goLogin")
    public String login(){
        return "login";
    }
}
