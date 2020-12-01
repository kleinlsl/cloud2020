package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @project: cloud2020
 * @description:
 * @author: SongLin.Lu
 * @date: 2020/12/1 - 15:41
 */
public interface LoadBalancer {
    ServiceInstance instance(List<ServiceInstance> serviceInstances);

}
