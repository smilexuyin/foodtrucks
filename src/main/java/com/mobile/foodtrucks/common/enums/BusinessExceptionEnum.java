package com.mobile.foodtrucks.common.enums;

import lombok.Getter;

/**
 * @author: yinxu
 * @date 2024/04/23
 * @desc Business exception information enumeration
 */
@Getter
public enum BusinessExceptionEnum {

    /**
     * system error
     */
    SYSTEM_ERROR(500,"system error");

    BusinessExceptionEnum(int code,String msg){
        this.code = code;
        this.msg = msg;
    }

    /**
     * error code
     */
    private int code;

    /**
     * error message
     */
    private String msg;


}
