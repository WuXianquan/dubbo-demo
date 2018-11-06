package com.parent.controller;

import org.springframework.web.bind.annotation.RequestMapping;
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
     * @return
     */
    @RequestMapping("/success")
    public String test(){
        return "test success!";
    }
}
