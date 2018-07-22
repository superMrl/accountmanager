package com.account.controller;

import com.account.model.User;
import com.account.service.LoginService;
import com.account.service.impl.LoginServiceImpl;
import com.account.utils.CommonUtils;
import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by superMrl on 2018/7/22.
 */
@RestController
public class LoginController {

    private static final Logger logger = Logger.getLogger(LoginController.class);

    @Autowired
    private LoginService loginService;

    /**
     * 登录
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping("/login")
    public String login(@PathParam("name") String name,@PathParam("password") String password){

        String result = "error";

        User login = loginService.login(name,password);
        if(!CommonUtils.isNull(login)){
            result = "success";
        }

        JSONObject json = new JSONObject();
        json.put("msg",result);
        return json.toString();
    }

}
