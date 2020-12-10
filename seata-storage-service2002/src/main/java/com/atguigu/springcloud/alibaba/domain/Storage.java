package com.atguigu.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @project: cloud2020
 * @description:
 * @author: SongLin.Lu
 * @date: 2020/12/10 - 15:25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Storage {
    private Long id;

    private Integer productId;

    private Integer total;

    private Integer used;

    private Integer  residue;
}

