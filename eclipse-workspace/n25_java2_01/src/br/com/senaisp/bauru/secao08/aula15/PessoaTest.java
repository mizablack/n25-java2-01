package br.com.senaisp.bauru.secao08.aula15;

public class PessoaTest {

		public static void main(String[] args) {
			Pessoa pe01 = new PessoaFisica();
		Pessoa pe02 = new PessoaJuridica();
		pe01.setNome("Roberval da Silva");
		try {
			pe01.setEndereco("Rua das Ruas, 1234");
			pe01.setDocumento("12345678909");
			
		} catch (DocumentosException e) {
			System.out.println("O Documentos esta inválido!");
			
		} catch (EnderecoException e) {
			System.out.println("O endereço deve ser preenchido!");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pe01.setDataNascimento("20/05/1999");

		pe02.setNome("Roberval da Silva 2");
		try {
			pe02.setEndereco("Rua das Ruas, 12345");
			pe02.setDocumento("123.456.789-10");
			
		} catch (DocumentosException e) {
			System.out.println("O Documentos esta inválido!");
			
		} catch (EnderecoException e) {
			System.out.println("O endereço deve ser preenchido!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pe02.setDataNascimento("20/05/1990");
		
		System.out.println(pe01);
		System.out.println(pe02);
	}

}