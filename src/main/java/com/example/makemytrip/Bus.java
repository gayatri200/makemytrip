package com.example.makemytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Bus {

    @GetMapping("/Bus")

    public String getData() {

        System.out.println("develop Chetana");

        System.out.println("develop Gayatri");
        return  "Please book your bus tickets  from mmt kindly book ticket for easy travel" ;

    }

}
