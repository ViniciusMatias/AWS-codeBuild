package com.example.testes.alunos.demotestealunos;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.testes.alunos.demotestealunos.model.Aluno;
import com.example.testes.alunos.demotestealunos.repository.AlunoRepository;

@SpringBootApplication
public class DemoTesteAlunosApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoTesteAlunosApplication.class, args);
	}

	@Autowired
	AlunoRepository alunoRepository;

	@Override
	public void run(String... args) throws Exception {

		Aluno aluno1 = new Aluno(null, "159753", "Jose");
		Aluno aluno2 = new Aluno(null, "123456", "Maria");
		Aluno aluno3 = new Aluno(null, "789456", "João");

		List<Aluno> alunos = Arrays.asList(aluno1,aluno2,aluno3);
		alunoRepository.saveAll(alunos);
	}

}
