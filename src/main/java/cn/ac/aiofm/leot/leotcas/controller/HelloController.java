package cn.ac.aiofm.leot.leotcas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("index")
    public String index(){
        return "hello,this is Index page";
    }
}
