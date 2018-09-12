package springboot.my_first_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App {
	public static void main(String[] args) {
		System.out.println(" Hello this from App");
		SpringApplication.run(App.class, args);
	}
}
