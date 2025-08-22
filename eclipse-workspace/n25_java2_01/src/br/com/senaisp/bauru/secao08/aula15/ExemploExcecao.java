package br.com.senaisp.bauru.secao08.aula15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploExcecao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			
		System.out.println("Digite o valor de a: ");
		int a = sc.nextInt();
		
		System.out.println("digite o valor de b ");
		int b = sc.nextInt();
		
		System.out.println(a/b);
		} catch (ArithmeticException e) {
			System.out.println("Ocorreu um erro");	
		} catch (InputMismatchException e) {
			System.out.println("Ovalor deve ser inteiro");
		} catch (Exception e) {
			System.out.println("Ocorreu um erro diferente:" + e.getMessage());
		}
		System.out.println("Se mão der erro eu apareço!!");
		dividirValor(10, 0);
		
	}
      public static void dividirValor (int a, int b) {
    	  if (b==0) {
    		  throw new RuntimeException("Ovalor de b deve ser maior ou menor que zero!");
    	  }
    	  System.out.println(a/b);
      }
}