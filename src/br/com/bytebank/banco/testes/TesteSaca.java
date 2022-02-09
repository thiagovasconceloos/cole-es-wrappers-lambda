package br.com.bytebank.banco.testes;
import br.com.bytebank.banco.modelo.*;
public class TesteSaca {

	

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);
		
			conta.deposita(200);
		try{conta.saca(210);
		} catch(SaldoInsuficienteException ex) {
			
			System.out.println("Erro Saldo Insuficiente: " + ex.getMessage());
		    
		}
		System.out.println(conta.getSaldo());
          
	}
	
	
	
}
