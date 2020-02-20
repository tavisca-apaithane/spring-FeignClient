package com.example.demo;

public class Store {
    private String name;
    private Integer value;

    public Store(String name, Integer value) {
        this.name = name;
        this.value = value;
    }
    public Store(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
