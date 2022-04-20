package br.java.EntregavelBackEnd;

import br.java.EntregavelBackEnd.Model.Aluno;
import br.java.EntregavelBackEnd.Repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EntregavelBackEndApplication implements CommandLineRunner {

	@Autowired
	AlunoRepository aluno_service;

	public static void main(String[] args) {
		SpringApplication.run(EntregavelBackEndApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.aluno_service.save(new Aluno("joao","2954632","123456","ciencias da computacao"));
	}
}
