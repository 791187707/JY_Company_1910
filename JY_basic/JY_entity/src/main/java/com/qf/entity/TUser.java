package com.qf.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class TUser implements Serializable {
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