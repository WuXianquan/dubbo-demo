package com.parent.controller;

import com.parent.bean.Order;
import com.parent.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: Lon
 * @Date: 2018/10/30 14:58
 * @Description:
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 测试tomcat部署 http://localhost:8082/user/user/success
     * @return
     */
    @RequestMapping("/success")
    public String success(){
        return "Hello user!";
    }

    @RequestMapping("/userOrderList")
    @ResponseBody
    public List<Order> userOrderList(@RequestParam("userId") String userId) {
        return userService.findOrderListByUserId(userId);
    }
}
