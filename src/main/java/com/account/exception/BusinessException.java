/**
 * Copyright (c) 2016 http://www.hualala.com
 */
package com.account.exception;


import com.account.config.error.ErrorCodeProperties;

/**
 * 会员系统自定义业务异常类
 * @author changjinlin
 * @version 2.0.0 2016-12-05
 */
public class BusinessException extends ServiceException {

    public BusinessException(String code, String msg) {
        super(code,msg);
    }

    public BusinessException(String code) {
        super(code, ErrorCodeProperties.init().getErrorMessage(code));
    }
    public BusinessException(String code, Object[] params) {
        super(code, ErrorCodeProperties.init().getErrorMessages(code, params));
    }

}
