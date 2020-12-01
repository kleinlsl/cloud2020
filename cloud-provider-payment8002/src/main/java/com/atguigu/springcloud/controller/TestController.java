package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @project: cloud2020
 * @description:
 * @author: SongLin.Lu
 * @date: 2020/11/26 - 9:52
 */
@RestController
@Slf4j
public class TestController {

    @GetMapping("/")
    public CommonResult test(){
        log.info("info",new Object());
        return new CommonResult(200,"成功");
    }
}
