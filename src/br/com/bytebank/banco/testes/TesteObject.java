package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;


// referencia object é obrigatoria é atribuida automaticamente
// todo objeto tem como  class mãe a classe object.

public class TesteObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Object cc = new ContaCorrente(112,211);
		Object cp = new ContaPoupanca(122,221);
		
		
		
		System.out.println("x");
		
		System.out.println(3);
		System.out.println(false);
		
		System.out.println(cc);
		println();
	}
     static void println() {
    	 
    	  
    	 
    	 
    	 
     }
     
    static void println(int ln) {
    	 
    	  
    	 
    	 
    	 
     }
    
    static void println(boolean f) {
   	 
  	  
   	 
   	 
   	 
    }
}
