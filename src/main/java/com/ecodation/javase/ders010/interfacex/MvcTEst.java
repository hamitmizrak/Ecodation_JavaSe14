package com.ecodation.javase.ders010.interfacex;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MvcTEst {
    @RequestMapping("/")
    private String init(String value) {
        return value + " hello world";
    }
}
