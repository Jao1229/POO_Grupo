package br.com.application;
import java.util.Scanner;
import br.com.entities.Graduacao_Nome;
import br.com.entities.Pessoas;
import br.com.entities.PosGraduacao_NomeIntegrantes;

public class Programa_NomeIntegrantes //Trocar o nome da classe para Programa_Andreas_Joao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		int count = 0;
		Graduacao_Nome graduacao = new Graduacao_Nome();
		PosGraduacao_NomeIntegrantes pos = new PosGraduacao_NomeIntegrantes();
		Pessoas pessoas = new Pessoas();
		
		System.out.println("\n------MENU------");
		System.out.println("\nCadastro Graduação:\n1 - Cadastro Pos Graduação\n2 - Sair\n3");
		opcao = sc.nextInt();
		
;		switch(opcao) {
			case 1:
				System.out.println("\nCadastro Graduação:");
				
				
				
				
				count++;
			break;
			
			case 2:
				
				
				
				count++;
			break;
			
			case 3:
				
			break;
			
			default:
				System.out.println("Esse valor nao existe, meu querido. Troca");
			break;
		}
				
				sc.close();

	}

}
