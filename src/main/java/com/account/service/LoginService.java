package com.account.service;

import com.account.model.User;
import org.springframework.stereotype.Service;

/**
 * Created by superMrl on 2018/7/22.
 */
public interface LoginService {

    User login(String name,String password);
}
