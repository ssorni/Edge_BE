package controller;

import service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;
import java.util.Map;

@Controller
public class THController {

    private final TestService testService;

    @Autowired
    public THController(TestService testService) {
        this.testService = testService;
    }

    @PostMapping("/data")
    @ResponseBody
    public Map<String, Float> receiveData(@RequestParam("temperature") float temperature, @RequestParam("humidity") float humidity) {
        testService.setTemperature(temperature);
        testService.setHumidity(humidity);

        Map<String, Float> response = new HashMap<>();
        response.put("temperature", temperature);
        response.put("humidity", humidity);

        return response;
    }

    @GetMapping("/test")
    public String test(Model model) {
        model.addAttribute("temperature", testService.getTemperature());
        model.addAttribute("humidity", testService.getHumidity());
        return "test";
    }
}
