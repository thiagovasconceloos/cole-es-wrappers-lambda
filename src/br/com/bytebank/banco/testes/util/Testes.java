package br.com.bytebank.banco.testes.util;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;



public class Testes {

	
		





		        public static void main(String[] args) {

		                Conta cc1 = new ContaCorrente(22, 33);
		                cc1.deposita(333.0);

		                Conta cc2 = new ContaPoupanca(22, 44);
		                cc2.deposita(444.0);

		                Conta cc3 = new ContaCorrente(22, 11);
		                cc3.deposita(111.0);

		                Conta cc4 = new ContaPoupanca(22, 22);
		                cc4.deposita(222.0);

		                List<Conta> lista = new ArrayList<>();
		                lista.add(cc1);
		                lista.add(cc2);
		                lista.add(cc3);
		                lista.add(cc4);
		                
		                for (Conta conta : lista) {
						   System.out.println(conta);	
						}
		               
                      
		                comparaContas comparador = new comparaContas();
		                
		                
		                lista.sort(comparador);
		                
		                System.out.println("====================");
		                
		                for (Conta conta : lista) {
							   System.out.println(conta);	
							}
		        }

		

	}


class  comparaContas implements Comparator<Conta> {
 //Comparar contas, ordenar pelo numero da Conta
	@Override
	public int compare(Conta o1, Conta o2) {
	      if(o1.getNumero()<o2.getNumero()) {
	    	   return -1;
	      }
	      
	      if(o1.getNumero() > o2.getNumero()) {
	    	   return 1;
	      }
	      
		return 0;
	}
	
	
	
	
}