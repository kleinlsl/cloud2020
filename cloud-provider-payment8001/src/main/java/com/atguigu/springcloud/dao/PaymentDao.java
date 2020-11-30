package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @project: cloud2020
 * @description: 付款记录的 Dao 层
 * @author: SongLin.Lu
 * @date: 2020/11/24 - 18:02
 */
@Mapper
public interface PaymentDao {
    /**
     * 添加付款记录
     * @param payment
     * @return
     */
    public int create(Payment payment);

    /**
     * 根据id获取付款记录
     * @param id
     * @return
     */
    public Payment getPaymentById(@Param("id") Long id);
}
