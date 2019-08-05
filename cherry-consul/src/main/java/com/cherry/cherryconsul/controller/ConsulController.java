package com.cherry.cherryconsul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConsulController {
    @Value("${server.port}")
    String port;

    @Value("${foo.bar}")
    String foo;

    @GetMapping("/hi")
    public String home(@RequestParam(defaultValue = "consul") String name) {
        return "hi "+name+",i am from port:" +port+",foo="+foo;
    }
}
