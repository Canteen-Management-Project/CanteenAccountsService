package canteen.management.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@ComponentScan(basePackages="canteen.management.accounts")
@SpringBootApplication(scanBasePackages="canteen.management.accounts")
public class CanteenAccountServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CanteenAccountServiceApplication.class, args);
	}

}
