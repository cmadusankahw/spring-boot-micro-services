package com.example.chiran.microservices.training.microservicesTraining.controller;

import com.example.chiran.microservices.training.microservicesTraining.model.MyIntroduction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParkingLotController {

    @GetMapping("/aboutMe")
    public MyIntroduction aboutMe() {
        return new MyIntroduction("Chiran" , 20, "Programming");
    }

    @PostMapping("/create")
    public MyIntroduction createSomeone(String name, int age, String skills) {
        return new MyIntroduction(name , age, skills);
    }

}
