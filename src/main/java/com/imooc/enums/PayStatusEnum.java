package com.imooc.enums;

import lombok.Getter;

/**
 * 支付状态枚举类
 * 为订单主表实体类的payStatus元素提供枚举
 */
@Getter
public enum PayStatusEnum {

    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
