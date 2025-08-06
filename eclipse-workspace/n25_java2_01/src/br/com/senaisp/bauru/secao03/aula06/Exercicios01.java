package br.com.senaisp.bauru.secao03.aula06;

import javax.swing.JOptionPane;

public class Exercicios01 {

	public static void main(String[] args) {
		
		 
		 
		 JOptionPane.showConfirmDialog(null,
	                "Olá, participante,e bem-vindo ao pograma de namoro favorito da América!",
	                "Bem-vindo participante",
	                JOptionPane.YES_NO_OPTION,
	                JOptionPane.INFORMATION_MESSAGE);
		 
		 String questao01 = (String)JOptionPane.showInputDialog(null,
	                "Qual é seu nome??",
	                "QUESTÃO 1",
	                JOptionPane.QUESTION_MESSAGE,
	                null,// ICONE
	                null,//OPÇOES DE ESCOLHA
	                "String.");
		 //solicitar para o usuario seutime favorito deve selicionar de uma lista
		 String[] acceptableValues = {"São Paulo", "Corinthians", "Santos","Noroeste","Vasco","Barcelona"};
	        String questao02 = (String)JOptionPane.showInputDialog(null,
	                "Seu time favorito?",
	                "QUESTÃO 2",
	                JOptionPane.QUESTION_MESSAGE,
	                null,
	                acceptableValues,
	                acceptableValues[0]);
	                
		 
		
	}

}
