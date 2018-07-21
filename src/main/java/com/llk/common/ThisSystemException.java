package com.llk.common;

/**
 * Created by Administrator on 2017/3/15 0015.
 */
public class ThisSystemException extends  RuntimeException {
    public ThisSystemException(String message) {
        super(message);
    }

    public ThisSystemException(String message, Throwable cause) {
        super(message, cause);
    }
}
