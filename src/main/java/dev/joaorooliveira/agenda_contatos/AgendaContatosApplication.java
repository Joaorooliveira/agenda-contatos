package dev.joaorooliveira.agenda_contatos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AgendaContatosApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgendaContatosApplication.class, args);
	}

}
