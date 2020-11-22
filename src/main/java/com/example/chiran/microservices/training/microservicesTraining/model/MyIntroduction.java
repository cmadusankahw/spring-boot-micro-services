package com.example.chiran.microservices.training.microservicesTraining.model;

import lombok.Builder;
import lombok.Data;

@Data
public class MyIntroduction {

    private String name;
    private int age;

    public MyIntroduction(String name, int age, String skills) {
        this.name = name;
        this.age = age;
        this.skills = skills;
    }

    private String skills;
}
