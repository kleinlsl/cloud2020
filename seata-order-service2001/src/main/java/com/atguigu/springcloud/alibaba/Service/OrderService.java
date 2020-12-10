package com.atguigu.springcloud.alibaba.Service;

import com.atguigu.springcloud.alibaba.domain.Order;

/**
 * @project: cloud2020
 * @description:
 * @author: SongLin.Lu
 * @date: 2020/12/10 - 15:29
 */
public interface OrderService {
    /**
     * 创建订单
     * @param order
     */
    void create(Order order);
}
