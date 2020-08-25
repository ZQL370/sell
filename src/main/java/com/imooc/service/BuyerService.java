package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * 买家service层接口
 *为确保安全查询取消而定义的两个方法
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
