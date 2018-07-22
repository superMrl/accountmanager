package com.account.service.impl;

import com.account.mapper.UserMapper;
import com.account.model.User;
import com.account.service.LoginService;
import com.account.utils.CommonUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by superMrl on 2018/7/22.
 */
@Service
public class LoginServiceImpl implements LoginService {

    private static final Logger logger = Logger.getLogger(LoginServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    /**
     * 登录
     * @param
     * @return
     */
    public User login(String name,String pwd) {
        User login = null;

        if(CommonUtils.isNull(name) || CommonUtils.isNull(pwd)){
            return login;
        }

        login = userMapper.selectUser(name,pwd);
        logger.info("login user is "+login);
        return login;
    }
}
