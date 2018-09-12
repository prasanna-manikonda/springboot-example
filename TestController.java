package springboot.my_first_application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping("/home")
	public String home() {
		return "Spring boot is working!";
	}
}