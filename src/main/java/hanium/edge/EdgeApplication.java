package hanium.edge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"hanium.edge", "controller", "service", "domain"})
public class EdgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdgeApplication.class, args);
	}
}