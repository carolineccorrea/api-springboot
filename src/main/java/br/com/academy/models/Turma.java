package br.com.academy.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;
import javax.persistence.ManyToOne;

@Entity
@Table(name="TB_TURMA")
public class Turma {
	
	@Id
	private Long id;
	
	private String nome;
	
	private int capacidade;
	
	@ManyToOne
	private Escola escola;
	
	@OneToMany(mappedBy="turma")
	List<Aluno> Alunos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public Escola getEscola() {
		return escola;
	}

	public void setEscola(Escola escola) {
		this.escola = escola;
	}

	public List<Aluno> getAlunos() {
		return Alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		Alunos = alunos;
	}
	
	

}
