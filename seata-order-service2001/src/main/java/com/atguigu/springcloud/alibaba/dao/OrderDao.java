package com.atguigu.springcloud.alibaba.dao;

import com.atguigu.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @project: cloud2020
 * @description:
 * @author: SongLin.Lu
 * @date: 2020/12/10 - 15:26
 */
@Mapper
public interface OrderDao {
    /**
     * 新建订单
     * @param order
     * @return
     */
    int create(Order order);

    /**
     * 修改订单状态 ， 从0改为1
     * @param userId
     * @param status
     * @return
     */
    int update(@Param("userId") Long userId, @Param("status") Integer status);
}
