package sapient.demo;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;






@SpringBootApplication
//@EnableEurekaClient
@EntityScan("sapient.demo")
@ComponentScan("sapient.demo")


public class CalculatorDemoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(CalculatorDemoApplication.class, args);
	}
}
