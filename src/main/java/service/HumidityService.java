package service;

import domain.HumidityDomain;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Getter
@Setter
@Service
public class HumidityService {

    private final HumidityDomain test;

    @Autowired
    public HumidityService(HumidityDomain test) {
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