package com.parent.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auther: Lon
 * @Date: 2018/10/29 17:48
 * @Description: 用户类
 */
@Data
public class User implements Serializable {

    private String id;

    private String username;

    private String password;
}
