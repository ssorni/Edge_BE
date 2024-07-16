package controller;

import service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class TestController {

    private final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/test")
    public String test(Model model) {
        model.addAttribute("temperature", testService.getTemperature());
        model.addAttribute("humidity", testService.getHumidity());
        return "test";
    }

}
