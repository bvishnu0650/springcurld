package com.ensat.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Homepage controller.
 */
@RestController
public class IndexController {

    @RequestMapping("/")
    String index() {
        return "index";
    }
    @RequestMapping("/welcome")
    public String welcomepage(){
        return "welcome to application";
    }

}
