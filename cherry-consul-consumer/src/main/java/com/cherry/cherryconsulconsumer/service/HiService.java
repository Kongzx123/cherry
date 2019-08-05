package com.cherry.cherryconsulconsumer.service;

import com.cherry.cherryconsulconsumer.feignClient.ConsulProductorClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HiService {

    @Autowired
    ConsulProductorClient consulProductorClient;

    public String sayHi(String name){
        return  consulProductorClient.sayHiFromClientEureka(name);
    }
}
