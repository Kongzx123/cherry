package com.cherry.cherryconsul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
/**
 * 支持服务被发现
 */
@EnableDiscoveryClient
public class CherryConsulApplication {

    public static void main(String[] args) {
        SpringApplication.run(CherryConsulApplication.class, args);
    }

}
