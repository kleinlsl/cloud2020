package com.atguigu.springcloud.controller;


import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @project: cloud2020
 * @description:
 * @author: SongLin.Lu
 * @date: 2020/11/24 - 18:17
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @ApiOperation(value = "插入订单信息")
    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int res = paymentService.create(payment);
        log.info("****插入结果："+res);
        if (res>0){
            return new CommonResult(200,"插入数据库成功",res);
        }else {
            return new CommonResult(444,"插入数据库失败",null);
        }
    }

    @ApiOperation(value = "通过Id查询订单信息")
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") @ApiParam("订单Id") Long id){
        Payment res = paymentService.getPaymentById(id);
        log.info("****查询结果："+res);
        try {
            int a=1;
        }
        catch (Exception e){
            
        }
        if (res!=null){
            return new CommonResult(200,"查询成功",res);
        }else {
            return new CommonResult(444,"没有对应记录,查询ID:"+id,null);
        }
    }

}
