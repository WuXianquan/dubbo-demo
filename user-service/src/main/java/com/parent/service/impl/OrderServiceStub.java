package com.parent.service.impl;

import com.parent.bean.Order;
import com.parent.service.OrderService;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @Auther: Lon
 * @Date: 2018/11/8 16:24
 * @Description: 订单服务本地存根
 */
@Slf4j
public class OrderServiceStub implements OrderService {

    private final OrderService orderService;

    public OrderServiceStub(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public List<Order> findOrderListByUserId(String userId) {
        try {
            log.info("订单服务本地存根调用findOrderListByUserId()...");
            return orderService.findOrderListByUserId(userId);
        } catch (Exception e) {
            log.error("调用订单服务异常：{}", e.getMessage(), e);
        }
        return null;
    }
}
