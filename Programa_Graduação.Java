package br.com.entities;

public class Graduacao_Andreas_Joao_Caio extends Pessoas{
	
	private String cursoGraduacao;
	

	public Graduacao_Andreas_Joao_Caio(String cpf, String nome, String matricula, String cursoGraduacao) {
		super(cpf, nome, matricula);
		this.cursoGraduacao = cursoGraduacao;
	}



	public String getCursoGraduacao() {
		return cursoGraduacao;
	}



	public void setCursoGraduacao(String cursoGraduacao) {
		this.cursoGraduacao = cursoGraduacao;
	}
    @Override
    public String toString() {
        return "GRADUAÇÃO -> Nome: " + getNome() +
               ", CPF: " + getCpf() +
               ", Matrícula: " + getMatricula() +
               ", Curso: " + cursoGraduacao;
    }
		

}

