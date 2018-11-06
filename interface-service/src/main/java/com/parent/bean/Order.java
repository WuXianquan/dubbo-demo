package com.parent.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auther: Lon
 * @Date: 2018/10/29 17:51
 * @Description: 订单类
 */
@Data
public class Order implements Serializable {

    private String orderId;

    private String orderNo;

}
