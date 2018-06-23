package com.ifox.springbootswagger2.exception;

import com.ifox.springbootswagger2.utils.ERRORDetail;
import com.ifox.springbootswagger2.utils.WebResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in9:40 2018/6/22
 * @Modified By:
 */
@ControllerAdvice
public class GlobalExceptionResolver {
    Logger logger = LoggerFactory.getLogger(GlobalExceptionResolver.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public WebResult exceptionHandle(HttpServletRequest req, Exception ex) {
        ex.printStackTrace();
        logger.error("未知异常", ex);
        return WebResult.error(ERRORDetail.RC_0401001);
    }
}
