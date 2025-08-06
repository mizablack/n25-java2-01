package br.com.senaisp.bauru.secao03.aula06;

import javax.swing.JOptionPane;

public class Input02 {

		    public static void main(String[] args) {
		        
		        JOptionPane.showMessageDialog(null,
		                "There's no input here, just a message",
		                "Title",
		                JOptionPane.ERROR_MESSAGE);

		        
		        String input1 = (String)JOptionPane.showInputDialog(null,
		                "Is this a question?",
		                "Dialog Title",
		                JOptionPane.WARNING_MESSAGE,
		                null,// ICONE
		                null,//OPÇOES DE ESCOLHA
		                "Type something here.");
		        
		        
		        String[] acceptableValues = {"Choice 1", "Choice 2", "Choice 3"};
		        String input2 = (String)JOptionPane.showInputDialog(null,
		                "Is this a question?",
		                "Dialog Title",
		                2,
		                null,
		                acceptableValues,
		                acceptableValues[1]);
		                
		    
		
	}

}
