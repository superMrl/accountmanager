package com.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by superMrl on 2018/7/21.
 */
@Controller
public class WelcomeController {

    @RequestMapping("/")
    public String login(){
        return "login";
    }
}
