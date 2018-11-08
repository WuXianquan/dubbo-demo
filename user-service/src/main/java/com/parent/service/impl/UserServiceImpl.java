package com.parent.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.parent.bean.Order;
import com.parent.service.OrderService;
import com.parent.service.UserService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Auther: Lon
 * @Date: 2018/10/29 18:04
 * @Description: 用户实现类
 */
@Service(interfaceClass = UserService.class)
@Component
public class UserServiceImpl implements UserService {

    @Reference(interfaceClass = OrderService.class, stub = "com.parent.service.impl.OrderServiceStub")
    private OrderService orderService;

    @Override
    public List<Order> findOrderListByUserId(String userId) {
        return orderService.findOrderListByUserId(userId);
    }
}
