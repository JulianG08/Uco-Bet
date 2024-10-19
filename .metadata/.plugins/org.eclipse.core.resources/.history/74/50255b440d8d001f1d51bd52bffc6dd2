package co.edu.uco.ucobet.generales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ComponentScan(basePackages = {"co.edu.uco.ucobet.generales"})
//@EnableJpaRepositories(basePackages = {"co.edu.uco.ucobet.generales.application.secondaryports.repository"})
//@EntityScan(basePackages = {"co.edu.uco.ucobet.generales.application.secondaryports.entity"})
public class UcobetApplication {
	
	@GetMapping("/getData")
	public String getMessage() {
		return "Accessed by HTTPS protocol";
	}

	public static void main(String[] args) {
		SpringApplication.run(UcobetApplication.class, args);
	}

}
