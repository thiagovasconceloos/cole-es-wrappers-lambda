package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestArrayReferencias {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		
	  ContaCorrente[] conta = new ContaCorrente[5];
	  ContaCorrente cc1 = new ContaCorrente(120,021);
	  
	  conta[0]= cc1;
	  
	  ContaCorrente cc2 = new ContaCorrente(220,022);
	  conta[1]= cc2;
		
		
		
	}
	
	
	
	
	
	
	
	
}
