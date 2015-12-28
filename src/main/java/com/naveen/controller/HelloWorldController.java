package com.naveen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    public ModelAndView firstController() {
        System.out.println("Reaching contoller method");
        String message = "<br><div style='text-align:center;'>"
                + "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from HelloWorldController.java **********</div><br><br>";
        ModelAndView mv = new ModelAndView("view1");
        mv.addObject("message", message);
        return mv;
    }
}
