package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @project: cloud2020
 * @description: 付款记录的 Service 层
 * @author: SongLin.Lu
 * @date: 2020/11/24 - 18:14
 */
public interface PaymentService {
    /**
     * 添加付款记录
     * @param payment 实体类对象
     * @return 0 or 1 是否付款成功
     */
    public int create(Payment payment);

    /**
     * 根据id获取付款记录
     * @param id
     * @return
     */
    public Payment getPaymentById(@Param("id") Long id);
}
