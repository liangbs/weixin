package com.ai.weixin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
    
    @RequestMapping(value = "/demo")
    public ModelAndView toDemo() {
        return new ModelAndView("demo");
    }
}