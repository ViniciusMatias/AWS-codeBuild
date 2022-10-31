package com.example.testes.alunos.demotestealunos;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.testes.alunos.demotestealunos.model.Aluno;
import com.example.testes.alunos.demotestealunos.services.AlunoService;

@SpringBootTest
class DemoTesteAlunosApplicationTests {

    @Autowired
    AlunoService alunoService;

    @Test
    public void criarAluno() {
        Aluno aluno = new Aluno(4L, "123456", "Tico");

        Aluno alunoSalvo = alunoService.createAluno(aluno);

        assertThat(alunoSalvo.getId()).isNotNull();
    }

}
