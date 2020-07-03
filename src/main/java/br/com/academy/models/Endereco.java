package br.com.academy.models;

import javax.persistence.Embeddable;

@Embeddable
public class Endereco {
	
	private String logradouro;
	
	private String complemento;
	
	private String bairro;
	
	private String cidade;
	
	private String estado;

}
