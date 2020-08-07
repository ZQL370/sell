package com.imooc.dto;

import lombok.Data;

/**
 * 购物车数据传输类（DTO:data transfer object）
 * 前端传来的item中包含的信息
 */
@Data
public class CartDTO {

    /**
     * 商品Id.
     */
    private String productId;

    /**
     * 数量.
     */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
