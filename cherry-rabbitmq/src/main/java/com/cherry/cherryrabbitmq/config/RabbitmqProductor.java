package com.cherry.cherryrabbitmq.config;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RabbitmqProductor {
    @Autowired
    private AmqpTemplate rabbitAmqpTemplate;

    @Value("test-exchange")
    private String exchange;
    /**
     * 路由键而非队列，即接收消息的地址，该地址负责将消息投递至订阅这个地址的队列（可能同时有多个队列订阅一个地址）
     */
    @Value("config-client-key")
    private String routingKey;

    public void sendNotice(String msg){
        this.rabbitAmqpTemplate.convertAndSend(exchange,routingKey,msg);
    }
}
