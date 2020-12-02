## 基础篇------Spring boot回顾篇
* tag:v1.0.01
* P1---P14
* time:2020/11/30 - 16:39

| 模块                                                      | 描述                   |
| --------------------------------------------------------- | ---------------------- |
| [cloud-api-commons](/cloud-api-commons)                   | 工程重构--抽取公共组件 |
| [cloud-consumer-order80](/cloud-consumer-order80)         | 消费者订单模块         |
| [cloud-provider-payment8001](/cloud-provider-payment8001) | 支付模块               |

## Eureka部分
* tag:v1.0.0.2
* P15---P27 
* time:2020/12/1 - 10:00

| 模块                                                      | 描述                   | 更改记录       |
| --------------------------------------------------------- | ---------------------- | -------------- |
| [cloud-api-commons](/cloud-api-commons)                   | 工程重构--抽取公共组件 | ----           |
| [cloud-consumer-order80](/cloud-consumer-order80)         | 消费者订单模块         | 添加eureka部分 |
| [cloud-provider-payment8001](/cloud-provider-payment8001) | 支付模块：payment8001  | 添加eureka部分 |
| [cloud-provider-payment8002](/cloud-provider-payment8002) | 支付模块：payment8002  |                |
| [cloud-eureka-server7001](/cloud-eureka-server7001)       | eureka服务端：7001     |                |
| [cloud-eureka-server7002](/cloud-eureka-server7002)       | eureka服务端：7002     |                |

## Zookeeper部分
* tag:v1.0.0.3
* P28---P30   
* time:2020/12/1 - 11:32
* [Ubuntu使用Docker安装zookeeper](/cloud-provider-payment8004)

| 模块                                                      | 描述       | 更改记录 |
| --------------------------------------------------------- | ---------- | -------- |
| [cloud-provider-payment8004](/cloud-provider-payment8004) | 服务提供者 | ----     |
| [cloud-consumerzk-order80](/cloud-consumerzk-order80)     | 服务消费者 | ----     |

## Consul部分

* tag：v1.0.0.4
* P31---P35
* time：2020/12/1 - 14:16

| 模块                                                         | 描述             | 更改记录 |
| ------------------------------------------------------------ | ---------------- | -------- |
| [cloud-provider-consul-payment8006](/cloud-provider-consul-payment8006) | consul服务提供者 | ----     |
| [cloud-consumer-consul-order80](/cloud-consumer-consul-order80) | consul服务消费者 | ----     |

* 三个注册中心的异同点

| 组件名    | 语言 | CAP  | 服务健康检查 | 对外暴露接口 | SpringCloud集成 |
| --------- | ---- | ---- | ------------ | ------------ | --------------- |
| Eureka    | Java | AP   | 可配支持     | HTTP         | 集成            |
| Consul    | GO   | CP   | 支持         | HTTP/DNS     | 集成            |
| Zookeeper | Java | CP   | 支持         | 客户端       | 集成            |

## Ribbon部分

* tag：v1.0.0.5
* P36---P42
* time：2020/12/1 - 16:22

| 模块                                                      | 描述           | 更改记录           |
| --------------------------------------------------------- | -------------- | ------------------ |
| [cloud-consumer-order80](/cloud-consumer-order80)         | 消费者订单模块 | 添加自定义轮询算法 |
| [cloud-provider-payment8001](/cloud-provider-payment8001) | 服务提供者8001 | 添加测试轮询的接口 |
| [cloud-provider-payment8002](/cloud-provider-payment8002) | 服务提供者8002 | 添加测试轮询的接口 |



## OpenFeign部分

* tag：v1.0.0.6
* P43---P46
* time：2020/12/2 - 9:55

| 模块                                                         | 描述           | 更改记录     |
| ------------------------------------------------------------ | -------------- | ------------ |
| [cloud-consumer-feign-order80](/cloud-consumer-feign-order80) | 消费者订单模块 | ----         |
| [cloud-provider-payment8001](/cloud-provider-payment8001)    | 服务提供者8001 | 添加超时接口 |
| [cloud-provider-payment8002](/cloud-provider-payment8002)    | 服务提供者8002 | 添加超时接口 |
