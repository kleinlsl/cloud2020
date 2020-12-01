package com.atguigu.springcloud;


import com.atguigu.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author dell
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(
        name = "CLOUD-PAYMENT-SERVICE", // name需要是大写
        configuration = MySelfRule.class
)
public class OrderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }

}
