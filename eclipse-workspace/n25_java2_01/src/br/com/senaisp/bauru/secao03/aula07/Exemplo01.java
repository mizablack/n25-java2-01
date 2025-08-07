package br.com.senaisp.bauru.secao03.aula07;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  scan = new Scanner(System.in);
		System.out.println("Digite os 3 valores:");
		int vlr01 = scan.nextInt();
		int vlr02 = scan.nextInt();
		int vlr03 = scan.nextInt();
		int  soma = vlr01 + vlr02 + vlr03;
		System.out.println("Soma dos 3 valores é: " + soma);
		
		
		scan.close();

	}

}
