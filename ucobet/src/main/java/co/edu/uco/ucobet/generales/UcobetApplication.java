package co.edu.uco.ucobet.generales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class UcobetApplication {
	
	@GetMapping("/getData")
	public String getMessage() {
		return "Accessed by HTTPS protocol";
	}

	public static void main(String[] args) {
		SpringApplication.run(UcobetApplication.class, args);
	}

}
