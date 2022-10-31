package com.example.testes.alunos.demotestealunos.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testes.alunos.demotestealunos.model.Aluno;
import com.example.testes.alunos.demotestealunos.repository.AlunoRepository;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository alunoRepository;

    public Aluno getAluno(Long id) {
        Optional<Aluno> alunoOptional = alunoRepository.findById(id);
        return alunoOptional.get();
    }

    public Aluno createAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }
}
