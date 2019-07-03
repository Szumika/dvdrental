package com.example.start.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class startController {

    @GetMapping("/start")
    public String start(){
        return "hej";
    }
}
