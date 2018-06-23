package com.ifox.springbootswagger2.rest;

import com.ifox.springbootswagger2.jwt.JsonWebTokenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in9:49 2018/6/22
 * @Modified By:
 */
@Controller
public class JwtTestController {
    @Autowired
    private JsonWebTokenUtils jwt;

    @RequestMapping(value = "/testJwt")
    @ResponseBody
    public String login(HttpServletResponse response){
        jwt.addToken(response,"haha~");

        System.out.println("login controller");
        return "haha";
    }

    @RequestMapping(value = "/testJwtdecrypt")
    @ResponseBody
    public String dec(HttpServletRequest request){

        jwt.getAuthentication(request);
        return "haha";
    }
}
