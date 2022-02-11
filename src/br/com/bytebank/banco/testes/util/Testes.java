package br.com.bytebank.banco.testes.util;

import java.util.ArrayList;
import java.util.Objects;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class Testes {

	public static void main(String[] args) {
		ArrayList lista = new ArrayList();
		
	    //Arraylist é uma array de referencias
		
		
		//Criamos uma conta contacorrente e estamos adicionando a referncia dela no array
		 Conta cc = new ContaCorrente(22, 11);
	        lista.add(cc);
       //Criamos uma conta contacorrente e estamos adicionando a referncia dela no array
	        Conta cc2 = new ContaCorrente(22, 22);
	        lista.add(cc2);
	        
	        //metodo size permite ver quantas posicões estao ocupadas no array
	        System.out.println(lista.size());
           
	        // pegamos o primeiro item do array e setamos uma referencia, alem disso fizemos um cast 
	        //pois o objeto é generico, então pra gerar uma referencia é preciso converter para algo mais especifico.
	        
	        Conta ref = (Conta) lista.get(0);
	        
	        
	        //criamos mais uma conta e adicionamos ao array
	        Conta cc3 = new ContaCorrente(234, 432);
	        lista.add(cc3);
	        
	        //criamos mais uma conta e adicionamos ao array

	        Conta cc4 = new ContaCorrente(231, 132);
	        lista.add(cc4);
	        
	        
	        
	        for ( int  i = 0 ; i < lista.size(); i++) {
	        	
	        	Object oRef = lista.get(i);
	        	
	        	System.out.println(oRef);
	        	
	        	
	        	
	        }
	        
	        for(Object oRef : lista) {
	        	
	        	
	        	System.out.println(oRef);
	        }
	        
	        
	}

}
