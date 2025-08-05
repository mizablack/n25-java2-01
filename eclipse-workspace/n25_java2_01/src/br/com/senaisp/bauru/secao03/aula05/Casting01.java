package br.com.senaisp.bauru.secao03.aula05;

public class Casting01 {

	public static void main(String[] args) {
		
		//Declare and initialize a byte with a value of 128
        //Observe NetBeans' complaint
              //byte bVlr = 128;
              short sVlr = 128;
              System.out.println("Isso vai dar perda na conversão: " + ((byte) sVlr));
              
             byte bVlr = 127;
             bVlr++;  // iria para 128,mas o limite do byte é -128 à127
             System.out.println("isso vai extrapolar o limite do byte: " + bVlr);
             
             short a, b, c;
             a = 1;
             b = 2;
             c = (short) (a+b);

        
        
        
    }    


}

