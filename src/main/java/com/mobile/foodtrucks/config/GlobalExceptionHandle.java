package com.mobile.foodtrucks.config;

import com.mobile.foodtrucks.common.exceptions.BusinessException;
import com.mobile.foodtrucks.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author: yinxu
 * @date 2024/04/23
 * @desc Global unified exception handling
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandle {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Object handleException(Exception e) {
        log.error("Exception",e);
        return Result.error(e.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public Object handleBusinessException(BusinessException e) {
        log.error("BusinessException",e);
        return Result.error(e.getMessage());
    }

}
