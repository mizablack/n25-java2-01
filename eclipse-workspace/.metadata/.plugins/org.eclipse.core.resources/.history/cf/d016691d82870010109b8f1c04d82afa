package br.com.senaisp.bauru.mizael.test;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.senaisp.bauru.mizael.classes.Produto;

public class CadastramentoProduto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int op;
		do {
			System.out.println("Sistema de Controle de Produto");
			System.out.println("1 - Cadastro um produto");
			System.out.println("2 - Listar produto");
			System.out.println("3 - Consultar um produto");
			System.out.println("4 - Alterar um produto");
			System.out.println("5 - Excluir um produto");
			System.out.println("9 - Fim");
			System.out.println("Escolha suaopção");
			// TRATAMENTO PARA ENTRADA DA OPÇÃO
			try {
				op = scan.nextInt();
			} catch (InputMismatchException e) {
				op = 0;
				scan.nextLine();// CAPTURA O ENTER DO ERRO
			}
			// VERIFICANDO AS OPÇÕES
			switch (op) {
			case 1 -> cadastrarProduto(scan);
			case 2 -> listarProdutos(scan);
			case 3 -> consultarProduto(scan);
			case 4 -> alterarProduto(scan);
			case 5 -> excluirProduto(scan);
			case 9 -> System.out.println("Até mais!");
			default -> System.out.println("Opção inválisa!!!");

			}

		} while (op != 0);

	}

	private static Object excluirProduto(Scanner scan) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object alterarProduto(Scanner scan) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object consultarProduto(Scanner scan) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object listarProdutos(Scanner scan) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void cadastrarProduto(Scanner scan) {
		System.out.println("Cadastramento de produto");
		do {
			try {
				if (scan.hasNext())
					scan.nextLine();

				// SE TIVER ALGO AINDA NO SCANNER, CAPTURAMOS NA LINHA ACIMA
				System.out.println("Digite a descrição");
				String desc = scan.nextLine();

				System.out.println("Digite a saldo");
				double saldo = scan.nextDouble();

				System.out.println("Digite a preço");
				double preco = scan.nextDouble();

				scan.nextLine();// CAPTURANDO O ENTER DO PREÇO

				System.out.println("Confirma gravação do produto (S/N)?");
				String conf = scan.nextLine();

				if (conf.toLowerCase().equals("s")) {
					try {
						Produto.create(desc, saldo, preco);
					} catch (SQLException e) {
						System.out.println("Problema ao gravar registro! " + e.getMessage());

					}
				}

			} catch (InputMismatchException e) {
				System.out.println("por favor, digita somente numeros");
			}
		} while (true);
	}

}
