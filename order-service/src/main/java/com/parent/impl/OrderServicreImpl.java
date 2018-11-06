package com.parent.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.parent.bean.Order;
import com.parent.service.OrderService;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Lon
 * @Date: 2018/10/30 10:05
 * @Description: 订单接口实现类
 */
@Service(interfaceClass = OrderService.class)
@Component
public class OrderServicreImpl implements OrderService {

    @Override
    public List<Order> findOrderListByUserId(String userId) {
        List<Order> orderList = new ArrayList<Order>();
        Order order = new Order();
        order.setOrderId("123456");
        order.setOrderNo("123456789");
        orderList.add(order);
        return orderList;
    }
}
