package farmacia;

import java.util.Scanner;

import farmacia.util.Cores;

public class Menu {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
int opcao;
		
		
		
		while (true) {

			System.out.println(Cores.TEXT_BLACK_BOLD + Cores.ANSI_WHITE_BACKGROUND
					+ "******************************************************");
			System.out.println("|                                                    |");
			System.out.println("|                    Farm+                           |");
			System.out.println("|                                                    |");
			System.out.println("******************************************************");
			System.out.println("|                    Bem-vindo!                      |");
			System.out.println("|            1 - Cadastrar Produto                   |");
			System.out.println("|            2 - Listar Todos os Produtos            |");
			System.out.println("|            3 - Consultar Produto por ID            |");
			System.out.println("|            4 - Atualizar Dados do Produto          |");
			System.out.println("|            5 - Excluir Produto                     |");
			System.out.println("|            0 - Sair                                |");
			System.out.println("|                                                    |");
			System.out.println("******************************************************");
			System.out.println("|Entre com a opção desejada:                         |");
			System.out.println("******************************************************" + Cores.TEXT_RESET);
			
			opcao = sc.nextInt();
			
			if (opcao == 0) {
				System.out.println("\nFarm+ para sua saúde!");
				sobre();
				sc.close();
				System.exit(0);
				
				switch (opcao) {
				case 1:
					System.out.println("Criar Conta \n\n");
					
					break;
					
				case 2:
					System.out.println("Listar todas as contas \n\n");
					
					break;
					
				case 3:
					System.out.println("Consultar dados da Conta \n\n");
					
					break;
					
				case 4:
					System.out.println("Atualizar Dados da Conta \n\n");
					
					break;
					
				case 5:
					System.out.println("Encerrar Conta \n\n");
					
					break;
					
			
				}
			}
		}
	}

	private static void sobre() {
		System.out.println(Cores.TEXT_BLACK_BOLD +
				Cores.ANSI_WHITE_BACKGROUND + "\n******************************************************");
		System.out.println("|Projeto desenvolvido por:                           |");
		System.out.println("|Victória Moraes - victoria.candido.mm@gmail.com     |");                          
		System.out.println("|https://github.com/VictoriaCM                       |");
		System.out.println("******************************************************" + Cores.TEXT_RESET);

	}
}

