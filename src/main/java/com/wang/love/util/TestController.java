package com.wang.love.util;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wang
 */
@Controller
@RestController
public class TestController {

    @GetMapping("/")
    public String test(){
        return "hello world";
    }
}
