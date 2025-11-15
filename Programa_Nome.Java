package br.com.application;
import java.util.Scanner;
import br.com.entities.Graduacao_Andreas_Joao_Caio;
import br.com.entities.Posgraduacao_Andreas_Joao_Caio;

public class Programa_Andreas_Joao_Caio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Graduacao_Andreas_Joao_Caio[] graduacao = new Graduacao_Andreas_Joao_Caio[10];
		Posgraduacao_Andreas_Joao_Caio[] pos = new Posgraduacao_Andreas_Joao_Caio[10];
		
		int gradCount = 0;
		int posCount = 0;
		int opcao;
		
        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1 - Cadastro Graduação");
            System.out.println("2 - Cadastro Pós-Graduação");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
            case 1:
                if (gradCount < 10) {
                    System.out.println("\nCADASTRO GRADUAÇÃO");

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();

                    System.out.print("Matrícula: ");
                    String matricula = sc.nextLine();

                    System.out.print("Curso de Graduação: ");
                    String curso = sc.nextLine();

                    graduacao[gradCount] =
                        new Graduacao_Andreas_Joao_Caio(nome, cpf, matricula, curso);

                    gradCount++;

                    System.out.println("Cadastro realizado com sucesso!\n");

                } else {
                    System.out.println("Limite de cadastros de Graduação atingido.");
                }
                break;
            case 2:
                if (posCount < 10) {
                    System.out.println("\nCADASTRO PÓS-GRADUAÇÃO");

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();

                    System.out.print("Matrícula: ");
                    String matricula = sc.nextLine();

                    System.out.print("Curso de Pós-Graduação: ");
                    String curso = sc.nextLine();

                    pos[posCount] =
                        new Posgraduacao_Andreas_Joao_Caio(nome, cpf, matricula, curso);

                    posCount++;

                    System.out.println("Cadastro realizado com sucesso!\n");

                } else {
                    System.out.println("Limite de cadastros de Pós-Graduação atingido.");
                }
                break;

            case 3:
                System.out.println("Saindo... Imprimindo todos os cadastros:\n");
                break;

            default:
                System.out.println("Opção inválida!");
            }

        } while (opcao != 3);

        
        System.out.println("=== CADASTROS GRADUAÇÃO ===");
        for (int i = 0; i < gradCount; i++) {
            System.out.println(graduacao[i]);
        }

        System.out.println("\n=== CADASTROS PÓS-GRADUAÇÃO ===");
        for (int i = 0; i < posCount; i++) {
            System.out.println(pos[i]);
        }
		
		sc.close();
	}

}
