package service;

import domain.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    private final Test test;

    @Autowired
    public TestService(Test test) {
        this.test = test;
    }

    public float getTemperature() {
        return test.getTemperature();
    }

    public void setTemperature(float temperature) {
        test.setTemperature(temperature);
    }

    public float getHumidity() {
        return test.getHumidity();
    }

    public void setHumidity(float humidity) {
        test.setHumidity(humidity);
    }
}
