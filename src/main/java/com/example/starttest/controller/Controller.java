package com.example.starttest.controller;

import com.example.wlhspringbootautoconfigure.service.WlhService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class Controller {

    @Resource
    private WlhService wlhService;

    @RequestMapping("/test")
    public String test(){
        return wlhService.test();
    }
}
