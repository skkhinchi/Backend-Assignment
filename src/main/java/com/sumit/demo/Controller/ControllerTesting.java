package com.sumit.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTesting {

    @GetMapping("/sumit")
    public String index() {

        return "This is Home page";
    }
    
}