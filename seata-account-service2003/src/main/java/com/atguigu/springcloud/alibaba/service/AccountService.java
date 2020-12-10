package com.atguigu.springcloud.alibaba.service;

import java.math.BigDecimal;

/**
 * @project: cloud2020
 * @description:
 * @author: SongLin.Lu
 * @date: 2020/12/10 - 16:25
 */
public interface AccountService {
    void decrease(Long userId, BigDecimal money);
}


