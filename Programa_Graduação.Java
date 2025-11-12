package br.com.entities;

public class Graduacao_Nome // mudar o nome o nome da classe para Graduacao_Andreas_Joao {
	private String nome;
	private String matricula;
	private String cpf;
	private String cursoGraduacao;
	
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return "Graduacao_Nome [nome=" + nome + ", matricula=" + matricula + ", cpf=" + cpf + "]";
	}
	
	
	

}
