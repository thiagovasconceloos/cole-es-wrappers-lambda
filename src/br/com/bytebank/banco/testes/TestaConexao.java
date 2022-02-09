package br.com.bytebank.banco.testes;
import br.com.bytebank.banco.modelo.*;

public class TestaConexao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Conexao con = null ;
     
		
		try {  con = new Conexao();
		     con.leDados();
		     
			
			
		}catch  (IllegalStateException ex ) {
			
			System.out.println("Deu erro na Conexao");
		
			
		} finally{
			 con.fecha();
			
		}
		
		
		
		
	}

}
