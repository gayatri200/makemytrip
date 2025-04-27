package com.example.makemytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Bus {

    @GetMapping("/Bus")
<<<<<<< HEAD
    public String getData() {return  "Please book your bus tickets  from mmt kindly book ticket for New Delhi " ;
=======

    public String getData() {
        System.out.println("develop A");
        return  "Please book your bus tickets  from mmt kindly book ticket for New Delhi" ;
>>>>>>> 06a8086ebea8f9845b5a086dac53ef536a711947

    }

}