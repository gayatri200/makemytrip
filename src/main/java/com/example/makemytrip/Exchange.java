package com.example.makemytrip;

        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RestController;

@RestController

public class Exchange {

    @GetMapping("/Exchange")

    public String getData() {
        System.out.println("develop by Gayatri");

        return  "Exchange Money 100$ in doller  $$$" ;

    }

}
