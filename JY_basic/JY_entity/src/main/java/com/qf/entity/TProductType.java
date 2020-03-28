package com.qf.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class TProductType implements Serializable {
    private Long cid;

    private String cname;

    private Long pid;

    private Byte flag;

    private Date createTime;

    private Date updateTime;

    private Long createUser;

    private Long updateUser;
}