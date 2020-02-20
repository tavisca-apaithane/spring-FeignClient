package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController()
public class AppController {

    @Autowired
    StoreClient storeClient;
    @GetMapping("/getstores")
    public List<Store> getStores(){
        List<Store> list = new ArrayList<>();
        list.add(new Store("Nashik", 10));
        list.add(new Store("Pune", 0));
        return list;
    }

    @GetMapping("/stores")
    public List<Store> stores(){
        return storeClient.getStores();
    }

    @GetMapping("/getdata")
    public String getData(){
        return "success";
    }

    @GetMapping("/dta")
    public String getFData(){
        return storeClient.getData();
    }
}
