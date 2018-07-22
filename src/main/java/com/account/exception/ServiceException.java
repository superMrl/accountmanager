package com.account.exception;

import lombok.Data;

/**
 * Created by superMrl on 2018/7/21.
 */
@Data
public class ServiceException extends java.lang.RuntimeException {

    private String errorCode;

    private String errorMessage;

    private Object[] params;

    public ServiceException(String errorCode) { /* compiled code */ }

    public ServiceException(String errorCode, Object[] params) { /* compiled code */ }

    public ServiceException(String errorCode, String errorMessage) { /* compiled code */ }

    public ServiceException(String errorCode, String errorMessage, Object[] params) { /* compiled code */ }

}
