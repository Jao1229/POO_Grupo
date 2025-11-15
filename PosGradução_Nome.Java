package br.com.entities;

public class Posgraduacao_Andreas_Joao_Caio extends Pessoas {
	
	private String cursoPos;

	public Posgraduacao_Andreas_Joao_Caio(String cpf, String nome, String matricula, String cursoPos) {
		super(cpf, nome, matricula);
		this.cursoPos = cursoPos;
	}

	public String getCursoPos() {
		return cursoPos;
	}

	public void setCursoPos(String cursoPos) {
		this.cursoPos = cursoPos;
	}
	
	@Override
	public String toString() {
        return "POS-GRADUAÇÃO -> Nome: " + getNome() +
                ", CPF: " + getCpf() +
                ", Matrícula: " + getMatricula() +
                ", Curso: " + cursoPos;
     }	

}
