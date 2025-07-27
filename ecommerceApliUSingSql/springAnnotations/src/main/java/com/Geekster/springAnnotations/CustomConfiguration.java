package com.Geekster.springAnnotations;


import org.springframework.stereotype.Component;

@Component
public class MyObject {
    private String name;

    public MyObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
