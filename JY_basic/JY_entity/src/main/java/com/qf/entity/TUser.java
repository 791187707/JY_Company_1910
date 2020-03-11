package com.qf.entity;

import java.util.Date;
import lombok.Data;

@Data
public class TUser {
    private Long id;

    private String uname;

    private String password;

    private String phone;

    private String email;

    private Boolean flag;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;
}