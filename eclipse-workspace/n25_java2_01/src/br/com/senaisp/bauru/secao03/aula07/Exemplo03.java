package br.com.senaisp.bauru.secao03.aula07;

import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  scan = new Scanner(Exemplo03.class.getResourceAsStream("FakeArq.txt"));
		String nome = scan.nextLine();
      scan.close();

	}

}
