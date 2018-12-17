package com.parent.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Lon
 * @Date: 2018/11/5 16:48
 * @Description:
 */
@RestController
@RequestMapping("/test")
public class TestController {

    /**
     * 测试tomcat部署 http://localhost:8081/order/test/success
     *
     * @return
     */
    @RequestMapping("/success")
    public String test() {
        return "test success!";
    }

    @RequestMapping("/testSetRedis")
    public String testSetRedis(HttpServletRequest request, @RequestParam(defaultValue = "Lon") String username) {
        String key = "user_" + username;
        request.setAttribute(key, username);
        return key;
    }

    @RequestMapping("/testGetRedis")
    public String testGetRedis(HttpServletRequest request, @RequestParam(defaultValue = "Lon") String username) {
        String key = "user_" + username;
        System.out.println(request.getAttribute(key));
        return (String) request.getAttribute(key);
    }
}
