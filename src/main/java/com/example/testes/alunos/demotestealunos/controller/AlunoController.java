package com.example.testes.alunos.demotestealunos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.testes.alunos.demotestealunos.model.Aluno;
import com.example.testes.alunos.demotestealunos.services.AlunoService;

@RestController
public class AlunoController {

    @Autowired
    AlunoService alunoService;

    @PostMapping("/alunos")
    public ResponseEntity<Aluno> executeAluno(@RequestBody Aluno aluno) {
        Aluno alunoSalvo = alunoService.createAluno(aluno);
        return ResponseEntity.ok().body(alunoSalvo);
    }

}
