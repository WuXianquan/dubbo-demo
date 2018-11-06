package com.parent.service;

import com.parent.bean.Order;

import java.util.List;

/**
 * @Auther: Lon
 * @Date: 2018/10/29 17:53
 * @Description: 用户接口
 */
public interface UserService {

    List<Order> findOrderListByUserId(String userId);
}
