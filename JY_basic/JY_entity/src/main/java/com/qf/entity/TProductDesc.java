package com.qf.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class TProductDesc implements Serializable {
    private Long id;

    private Long pid;

    private String pdesc;

    private Byte flag;

    private Date createTime;

    private Date updateTime;

    private Long createUser;

    private Integer updateUser;
}