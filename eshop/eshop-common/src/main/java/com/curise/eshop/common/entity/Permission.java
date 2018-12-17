package com.curise.eshop.common.entity;

import lombok.Data;

import java.util.Date;

/**
 * 〈权限实体〉
 *
 * @author Curise
 * @create 2018/12/13
 * @since 1.0.0
 */
@Data
public class Permission {

    private int id;
    private String zuulPrefix;
    private String servicePrefix;
    private String method;
    private String uri;
    private Date createTime;
    private Date updateTime;
}
