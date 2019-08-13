package com.cherry.cherryrabbitmq.controller;

import com.cherry.cherryrabbitmq.config.RabbitmqProductor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rabbit")
public class TestController {

    @Autowired
    private RabbitmqProductor productor;

    @RequestMapping("send")
    public void send(){
        productor.sendNotice("测试rabbitmq");
    }
}
