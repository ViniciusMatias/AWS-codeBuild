package com.example.testes.alunos.demotestealunos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testes.alunos.demotestealunos.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
