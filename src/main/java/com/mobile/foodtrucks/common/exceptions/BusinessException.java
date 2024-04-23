package com.mobile.foodtrucks.common.exceptions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mobile.foodtrucks.util.Result;

/**
 * @author: yinxu
 * @date 2024/04/23
 * @desc Business exception handling class
 */
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private final static ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    private Integer code;

    private String message;

    private Throwable throwable;

    public BusinessException() {
        super();
    }

    public BusinessException(String message) {
        super(message);
        this.message = message;
    }

    public BusinessException(Integer code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
        this.message = String.format("%s %s", message, cause.getMessage());
    }

    public BusinessException(int code, String message, Throwable throwable) {
        super(message);
        this.code = code;
        this.message = message;
        this.throwable = throwable;
    }

    public BusinessException(Result result) {
        this(result.getCode(), result.getMsg(), null);
    }

    public BusinessException(Result result, Throwable throwable) {
        this(result.getCode(), result.getMsg(), throwable);
    }

    public BusinessException(Result result, Object... args) {
        super(result.getMsg());
        String message = result.getMsg();
        try {
            message =
                    String.format("%s %s", result.getMsg(), OBJECT_MAPPER.writeValueAsString(args));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        this.message = message;
        this.code = result.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
