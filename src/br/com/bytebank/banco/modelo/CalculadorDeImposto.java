package br.com.bytebank.banco.modelo;

/**
 *  Classe responsável pelo calculo do imposto.
 * @author Thiago Vasconcelos
 *
 */

public class CalculadorDeImposto {
	
	private double totalImposto;
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}

}
