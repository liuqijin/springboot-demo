package com.liu.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class K8sController {
    @GetMapping("k8s")
    public String hello() {
        return "hello,k8s";
    }
}
