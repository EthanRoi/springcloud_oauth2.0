package com.curise.eshop.common.entity;

import lombok.Data;

/**
 * 〈响应实体〉
 *
 * @author Curise
 * @create 2018/12/13
 * @since 1.0.0
 */
@Data
public class Result {

    private int code;
    private String message;
    private Object data;

}
