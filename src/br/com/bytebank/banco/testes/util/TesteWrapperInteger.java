package br.com.bytebank.banco.testes.util;

import java.util.*;

public class TesteWrapperInteger {
	
	public static void main(String[] args) { 
		
		
		int[] idades = new int[5];
		String[] nomes = new String[5];
		
		int idade = 29 ;
		
		Integer idadeRef = Integer.valueOf(29); //autoboxing 
		
		
		System.out.println(idadeRef.doubleValue());


		
	
		
		
		int valor = idadeRef.intValue(); 
		
		String s  = args[0]; // 10
		
		
		//Integer numero  = Integer.valueOf(s);
		 
		Integer numero = Integer.parseInt(s);
	    
		System.out.println(numero);
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29);
		
		
	
				
				
		
		
		
		
		
		
		
		
		
		
	}
	

}
