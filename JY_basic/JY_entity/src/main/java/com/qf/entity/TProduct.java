package com.qf.entity;

import java.util.Date;
import lombok.Data;

@Data
public class TProduct {
    private Integer pid;

    private String pname;

    private Long price;

    private Long salePrice;

    private Long typeId;

    private Byte status;

    private String pimage;

    private Byte flag;

    private Date createTime;

    private Date updateTime;

    private Long createUser;

    private Integer updateUser;
}