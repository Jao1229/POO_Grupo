package br.com.entities;

public class Pessoas {
	private String cpf;
	private String nome;
	private String matricula;
	
	
	public Pessoas(String cpf, String nome, String matricula) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.matricula = matricula;
		
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
}
