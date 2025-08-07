package br.com.senaisp.bauru.secao03.aula07;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo04 {

	public static void main(String[] args) {
		Scanner  scan = new Scanner(Exemplo04.class.getResourceAsStream("teste01")).useLocale(Locale.US);
		                                                   //INDICANDO QUE SERA USADO O PADRÃO AMERICANO
		
		/*while (scan.hasNext()) {
			String linha = scan.nextLine();
			System.out.println(linha);
			
		}*/
		
		System.out.println(scan.nextLine());
		
		System.out.println(scan.nextInt());
		System.out.println(scan.nextInt());
		System.out.println(scan.nextInt());
		
		System.out.println(scan.nextDouble());
		System.out.println(scan.nextDouble());
		System.out.println(scan.nextDouble());
		
	    scan.nextLine();
	    System.out.println(scan.nextLine());
	    
		scan.close();
	}
}
