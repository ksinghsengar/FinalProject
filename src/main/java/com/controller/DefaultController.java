package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by krishan on 7/12/2017.
 */
@Controller
public class DefaultController {
    @RequestMapping("/index")
    public ModelAndView dispaly(){
        ModelAndView modelAndView = new ModelAndView("home");
        return modelAndView;
    }
}
