package br.com.bytebank.banco.testes.util;

public class TesteOutrosWrappers {

	public static void main(String[] args) {
		Integer idadeRef = Integer.valueOf(29); //autoboxing
		System.out.println(idadeRef.intValue()); //unboxing
		
		Double dRef= Double.valueOf(3.2); //autoboxing
		System.out.println(dRef.doubleValue()); //unboxing
		
		
		Boolean bREf = Boolean.TRUE;
		System.out.println(bREf.booleanValue());
		

	}

}
