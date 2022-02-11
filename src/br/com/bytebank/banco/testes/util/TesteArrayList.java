package br.com.bytebank.banco.testes.util;

import java.util.ArrayList;
import java.util.Objects;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		//neste array so tem objetos do tipo conta
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
	    //Arraylist é uma array de referencias
		
		
		//Criamos uma conta contacorrente e estamos adicionando a referncia dela no array
		 Conta cc = new ContaCorrente(22, 11);
	        lista.add(cc);
       //Criamos uma conta contacorrente e estamos adicionando a referncia dela no array
	        Conta cc2 = new ContaCorrente(22, 22);
	        lista.add(cc2);
	        
	        //metodo size permite ver quantas posicões estao ocupadas no array
	        System.out.println(lista.size());
           
	        // pegamos o primeiro item do array e setamos uma referencia
	       
	        
	        Conta ref =  lista.get(0);
	        
	        
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
	        
	        for(Conta oRef : lista) {
	        	
	        	
	        	System.out.println(oRef);
	        }
	        
	        
	}

}
