package com.example.shiro.web.controller;

import com.example.shiro.web.utils.SpringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(("/demo"))
public class DemoController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }

    @RequestMapping("/beans")
    @ResponseBody
    public Object beans() {
        return SpringUtils.getBeanDefinitionNames();
    }

}
