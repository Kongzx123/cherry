package com.cherry.cherryrabbitmq.config;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

@Component
public class RabbitConsumer {
    @RabbitListener(
            bindings = @QueueBinding(
                    value = @Queue(value = "firstqueue", durable = "true", autoDelete = "false"),
                    exchange = @Exchange(value = "test-exchange", durable = "true", type = ExchangeTypes.DIRECT),
                    key = "config-client-key"
            )
    )
    @RabbitHandler
    public void notice(String msg) {
        System.out.println(msg);
    }
}
