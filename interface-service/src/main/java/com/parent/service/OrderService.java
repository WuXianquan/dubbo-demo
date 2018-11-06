package com.parent.service;

import com.parent.bean.Order;

import java.util.List;

/**
 * @Auther: Lon
 * @Date: 2018/10/30 10:06
 * @Description: 订单接口
 */
public interface OrderService {

    List<Order> findOrderListByUserId(String userId);
}
