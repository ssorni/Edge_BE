package controller;

import service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class THController {

    private final TestService testService;

    @Autowired
    public THController(TestService testService) {
        this.testService = testService;
    }

    @PostMapping("/data")
    public String receiveData(@RequestParam("temperature") float temperature, @RequestParam("humidity") float humidity, Model model) {
        testService.setTemperature(temperature);
        testService.setHumidity(humidity);
        model.addAttribute("temperature", temperature);
        model.addAttribute("humidity", humidity);
        return "redirect:/test";
    }
}
