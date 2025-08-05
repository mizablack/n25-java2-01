package br.com.senaisp.bauru.secao03.aula05;

public class ShoppingCart02 {

	public static void main(String[] args) {
		// Declarar as variaveis do exercicios
		
		String custName="Mizael";//nome do cliente
		String itemDesc="camiseta";//item a ser comprado
		double preco = 5.00;
		double imposto =18.00;
		int quantidade = 2;
		// montar a mensagem
		double totalPrise = preco * quantidade * (1+ imposto /100);
		// vamos precisar ajustar a mensagem para esse exercicios
		
		String message = custName + " quer comprar " + quantidade + " " + itemDesc + "\nO Custo total com imposto é R$: " + 
		            Math.round(totalPrise*100)/100.;
		//Math.round arredonda para parte interira por isso multiplico por 100 e 
		//depois divido por 100. (divisão inteira iria suprimir as casas)
		
		// imprimir a mensagem
		System.out.println(message);
		
		
		//montar a mensagem

	}

}
