package br.com.santander.desafio_santander;

import br.com.santander.desafio_santander.principal.Principal;
import br.com.santander.desafio_santander.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioSantanderApplication {

//	@Autowired
//	private EnderecoRepository enderecoRepository;

	public static void main(String[] args) {
		SpringApplication.run(DesafioSantanderApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		Principal principal = new Principal(enderecoRepository);
//		principal.exibeCEP();
//	}
}
