package com.qf.entity;

import java.util.Date;
import lombok.Data;

@Data
public class TProductDesc {
    private Long id;

    private Long pid;

    private String pdesc;

    private Byte flag;

    private Date createTime;

    private Date updateTime;

    private Long createUser;

    private Integer updateUser;
}