package br.com.academy.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.academy.models.Aluno;
import br.com.academy.repository.AlunoRepository;

@RestController
@RequestMapping(value="/api")
//@CrossOrigin(origins="*")
public class AlunoResources {
	
	@Autowired
	AlunoRepository alunoRepository;
	
	@GetMapping("/alunos")
	public List<Aluno> listaAlunos(){
		return alunoRepository.findAll();
	}

}
