package br.com.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.academy.models.Aluno;

public interface AlunoRepository extends JpaRepository <Aluno,Long> {

}
