package be.tomcools.javaboost;

import be.tomcools.javaboost.commands.GatttoolCommandWrapper;
import be.tomcools.javaboost.commands.Motor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JavaBoostApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaBoostApplication.class, args);
	}

	@Bean
	CommandLineRunner runOnStartup() {
		return (String[] args) -> new GatttoolCommandWrapper().motorAngle(Motor.A,90,75);
	}
}