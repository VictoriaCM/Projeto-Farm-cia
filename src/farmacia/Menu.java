package farmacia;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import farmacia.util.Cores;
import produto.model.Produto;
import produto.model.Medicamento;
import produto.controller.ProdutoController;
import produto.model.Cosmetico;

public class Menu {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		ProdutoController produtos = new ProdutoController();
		
	
		int opcao, tipo;
		String nome,generico, fragrancia;
		float valor;
		

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
			System.out.println("|            6 - Sair                                |");
			System.out.println("|                                                    |");
			System.out.println("******************************************************");
			System.out.println("|Entre com a opção desejada:                         |");
			System.out.println("******************************************************" + Cores.TEXT_RESET);

		
			try {
			opcao = sc.nextInt();
			
				} catch (InputMismatchException e) {
					System.out.println("Digite valores inteiros!");
					sc.nextLine();
					opcao = 0;
				}
					
			
			if (opcao == 6) {
				System.out.println("\nFarm+ para sua saúde!");
				sobre();
				sc.close();
				System.exit(0);
				
				switch (opcao) {
				case 1:
					System.out.println("Cadastrar Produto \n\n");
					System.out.print("Digite o tipo do produto (1-Medicamento / 2-Cosmético): ");
						tipo = sc.nextInt();
						
					System.out.print("Digite o nome do produto: ");
					sc.skip("\\R?");
					nome = sc.nextLine();
					
					System.out.println("Digite o Valor do Produto: ");
					valor = sc.nextFloat();
					
					switch (tipo) {
					case 1:
						System.out.println("Nome da opção genérica do medicamento: ");
						sc.skip("\\R?");
						generico = sc.nextLine();
						produtos.criaProduto(new Medicamento(produtos.gerarId(), nome, tipo, valor, generico));
					

					case 2:
						System.out.println("Nome da fragrância do cosmético: ");
						sc.skip("\\R?");
						fragrancia= sc.nextLine();
						produtos.criaProduto(new Cosmetico(produtos.gerarId(), nome, tipo, valor, fragrancia));
						
					}
					keyPress();
					break;
					
				case 2:
					System.out.println("Listar Todos os Produtos  \n\n");
					produtos.listarTodosProdutos();;
					
					keyPress();
					break;
					
				case 3:
					System.out.println("Consultar Produto por ID \n\n");
					
					keyPress();
					break;
					
				case 4:
					System.out.println("Atualizar Dados do Produto  \n\n");
					
					keyPress();
					break;
					
				case 5:
					System.out.println("Excluir Produto \n\n");
					
					keyPress();
					break;
					
			
				}
			}
		}
		}

	private static void sobre() {
		System.out.println(Cores.TEXT_BLACK_BOLD + Cores.ANSI_WHITE_BACKGROUND
				+ "\n******************************************************");
		System.out.println("|Projeto desenvolvido por:                           |");
		System.out.println("|Victória Moraes - victoria.candido.mm@gmail.com     |");
		System.out.println("|https://github.com/VictoriaCM                       |");
		System.out.println("******************************************************" + Cores.TEXT_RESET);
	}

	public static void keyPress() {

		try {

			System.out.println(
					Cores.TEXT_BLACK_BOLD + Cores.ANSI_WHITE_BACKGROUND + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println(Cores.TEXT_BLACK_BOLD + Cores.ANSI_WHITE_BACKGROUND
					+ "Você pressionou uma tecla diferente de enter!");
		}
	}
}
