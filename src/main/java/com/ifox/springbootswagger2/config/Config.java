package com.ifox.springbootswagger2.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in9:28 2018/6/22
 * @Modified By:
 */
@Component
@PropertySource(value = {"classpath:application.yml"},encoding = "utf-8")
public class Config {

    @Value("${resources.midpHost}")
    private String midpHost;

    @Value("${jwt.SECRET}")
    private String secret;

    @Value("${jwt.EXPIRATIONTIME}")
    private long expirationtime;

    public String getSecret() {
        return secret;
    }

    public long getExpirationtime() {
        return expirationtime;
    }

    public String getMidpHost() {
        return midpHost;
    }
}
