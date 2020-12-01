package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @project: cloud2020
 * @description: @RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)
 * @author: SongLin.Lu
 * @date: 2020/12/1 - 15:15
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        // 随机规则
        return new RandomRule();
    }
}
