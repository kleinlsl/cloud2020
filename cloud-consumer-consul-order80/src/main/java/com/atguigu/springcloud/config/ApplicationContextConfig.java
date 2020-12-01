package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @project: cloud2020
 * @description:
 * @author: SongLin.Lu
 * @date: 2020/12/1 - 14:06
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced   //开启RestTemplate的负责均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
