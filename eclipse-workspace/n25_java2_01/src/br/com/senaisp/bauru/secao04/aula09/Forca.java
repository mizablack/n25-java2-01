package br.com.senaisp.bauru.secao04.aula09;

import java.util.Random;
import java.util.Scanner;

public class Forca {
	
	private String palavraSecreta;
	private String palavraMascarada;
	private int erros;
	//numeros aleatorios
	private Random rnd;
	//Constructor
	public Forca() {
		rnd = new Random();
		int linhaEscolhida = rnd.nextInt(180);
		int linhaAtual = 0;
		Scanner scan = new Scanner(Forca.class.getResourceAsStream("palavras.txt"));
		while (scan.hasNextLine()) {
			String apoio = scan.nextLine();
			if (linhaAtual ==linhaEscolhida) {
				palavraSecreta = "" + apoio;
				palavraMascarada = "_".repeat(palavraSecreta.length());
				break;
			}
			linhaAtual++;
		}
		scan.close();
		erros = 0;
	}
	public String getPalavraMascarada() {
		return palavraMascarada;
	}
	public int getErros() {
		return erros;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String linha = "+---+\n"+
		               "|   " + (erros>=2 ? "\\" : " ") +
		                        (erros>=1 ? "O" : " " ) +
		                        (erros>=3 ? "/" : " " ) + "\n" + //linha 2
		               "|    " + (erros>=4 ? "|" : " " )+ "\n" + //linha 3
		               "|   " + (erros>=5 ? "/" : " " )+ " " +
		                        (erros>=6 ? "\\" : " " )+ "\n" + //linha4
		               "|\n" +                                   //linha 5
		               "=== " + getPalavraMascarada() + "\n";      //limha6
		                      
		
		return linha;
	}
	public void lancarLetra(char letra) {
		if (palavraSecreta.contains((""+letra).toLowerCase())) {
			String apoio="";
			for (int i=0;i<palavraSecreta.length();i++) {
				if((""+letra).toLowerCase().equals(""+palavraSecreta.charAt(i))) {
				apoio += palavraSecreta.charAt(i);	
			}else {
				apoio += palavraMascarada.charAt(i);
				}
			}	
			palavraMascarada = "" + apoio;
	} else {
					
		erros++; //Aumenta um erro
		System.out.println("A letra " + letra + " não está no texto!");
	}
	
   }
	public boolean ehFimDeJogo() {
		return erros>=6 || !palavraMascarada.contains("_");
		
	}
	public String getPalavraRevelada() {
		return ehFimDeJogo() ? palavraSecreta : "";
}
	
}

