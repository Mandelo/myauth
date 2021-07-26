package com.luoxiao.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: luox
 * @date： 2021/7/22
 */

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World.";
    }


}
