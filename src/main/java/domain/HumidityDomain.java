package domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
public class HumidityDomain {
    private float temperature;
    private float humidity;
}