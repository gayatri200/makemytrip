package com.example.makemytrip;

        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RestController;

@RestController

public class Exchange {

    @GetMapping("/Exchange")

    public String getData() {

        return  "Exchange Money" ;

    }

}
