package com.mobile.foodtrucks.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import io.micrometer.common.util.StringUtils;
import lombok.Data;

import java.io.Serializable;


/**
 * @author: yinxu
 * @date 2024/04/23
 * @desc api return
 */
@Data
public class Result<T> implements Serializable {
    private static final long serialVersionUID = -1686054524991742104L;
    protected Integer code = 200;
    protected String msg = "success";
    protected T data;

//    private Map<String, String> enumVal = new HashMap<>();

    public Result() {
        super();
    }

    public Result(Integer code, String msg) {
        super();
        this.code = code;
        this.msg = msg;
    }

    public static <T> Result<T> error(String msg) {
        return new Result<T>(-1, msg);
    }

    public static <T> Result<T> error(String msg, T data) {
        Result<T> result = new Result<T>(-1, msg);
        if (null != data) {
            result.setData(data);
        }
        return result;
    }

    public static <T> Result<T> error(Integer code, String msg){
        return error(code,msg,null);
    }

    public static <T> Result<T> error(Integer code, String msg, T data) {
        Result<T> result = new Result<T>(code, msg);
        if (null != data) {
            result.setData(data);
        }
        return result;
    }

    public static <T> Result<T> success() {
        return success(null, null);
    }

    public static <T> Result<T> success(T data) {
        ObjectMapper objectMapper = new ObjectMapper();

        return success(null, data);
    }

    public static <T> Result<T> success(String msg, T data) {
        return success(200,msg,data);
    }

    public static <T> Result<T> success(int code, T data) {
        return success(code,"Success",data);
    }

    public static <T> Result<T> success(int code, String msg) {
        return success(code,msg,null);
    }

    public static <T>Result<T> success(int code,String msg, T data){
        Result<T> result = new Result<>();
        if (StringUtils.isNotBlank(msg)) {
            result.setMsg(msg);
            result.setCode(code);
        }
        if (null != data) {
            result.setData(data);
        }
        return result;
    }

    @Override
    public String toString() {
        return JsonMapper.findModules().toString();
    }

}