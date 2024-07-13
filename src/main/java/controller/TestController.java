package controller;

import domain.Test;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/test")
    public String test(Model model) {

        Test test = new Test();

        test.setTemperature(25);
        test.setHumidity(60);

        model.addAttribute("temperature", test.getTemperature());
        model.addAttribute("humidity", test.getHumidity());

        return "test";
    }
}
