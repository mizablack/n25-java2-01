package br.com.senaisp.bauru.secao03.aula07;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  scan = new Scanner(System.in);
		System.out.println("Digite seu nome completo:");
		String nome = scan.next();
        System.out.println("Seu nome é " + nome);
        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();
        scan.nextLine();
        System.out.println("Digite seu endereço: ");
        String endereco = scan.nextLine();
        System.out.println("Seu enderenço é: " + endereco);
        System.out.println("Sua idade é: " + idade);
        scan.close();
		
	}

}
