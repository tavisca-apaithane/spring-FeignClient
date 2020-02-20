package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "StoreClient", url = "localhost:8080")
public interface StoreClient {

    @GetMapping("/getstores")
    public List<Store> getStores();

    @GetMapping("/getdata")
    public String getData();
}
