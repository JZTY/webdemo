package com.example.webdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ppj
 * @date 2022/07/20
 */
@Controller
public class TestController {

    @RequestMapping("/hello")
    @ResponseBody
    public String test(){
        return "ppj不挂起";
    }


}
