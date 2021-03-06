package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @project: cloud2020
 * @description:
 * @author: SongLin.Lu
 * @date: 2020/11/30 - 15:46
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
//    @LoadBalanced //赋予RestTemplate负责均衡的能力
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
