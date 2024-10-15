package com.humanbooster.capital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class capitalController {

    @RequestMapping("/")
    public ModelAndView list(){
    ModelAndView mv = new ModelAndView("capital-list");
    return mv;
    }
}
