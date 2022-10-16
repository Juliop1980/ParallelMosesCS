//package com.javainuse.controllers;
package com.example.parallelmosescs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//@RestController
@Controller
public class TestController {
//
//    @RequestMapping("/")
//    public String home(){
//        return "Hello World!";
//    }

    @RequestMapping(value="/welcome")
    public ModelAndView firstPage() {
//        System.out.println("i am working");
        return new ModelAndView("welcome");
    }
}
