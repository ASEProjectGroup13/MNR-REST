package org.codercats.mnr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class MNRRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MNRRestApplication.class, args);
	}
}
