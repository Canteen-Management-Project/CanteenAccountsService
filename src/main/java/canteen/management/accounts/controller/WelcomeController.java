package canteen.management.accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class WelcomeController {
	
	@GetMapping("/hello")
	public String Hello() {
		return "Hello from Accounts Service!!";
	}

}
