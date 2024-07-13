package controller;

import domain.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class THController {

    private final Test test;

    @Autowired
    public THController(Test test) {
        this.test = test;
    }

    @PostMapping("/data")
    public String receiveData(@RequestParam float temperature, @RequestParam float humidity, Model model) {
        test.setTemperature(temperature);
        test.setHumidity(humidity);

        model.addAttribute("temperature", temperature);
        model.addAttribute("humidity", humidity);

        return "redirect:/test";
    }
}
