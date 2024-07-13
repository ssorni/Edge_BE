package controller;

import domain.Test;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

     private final Test test;

     @Autowired
     public TestController(Test test) {
         this.test = test;
     }

    @GetMapping("/test")
    public String test(Model model) {

        model.addAttribute("temperature", test.getTemperature());
        model.addAttribute("humidity", test.getHumidity());

        return "test";
    }
}
