package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @project: cloud2020
 * @description:
 * @author: SongLin.Lu
 * @date: 2020/12/1 - 11:24
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced     //支持负责均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
