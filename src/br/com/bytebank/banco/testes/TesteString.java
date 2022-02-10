package br.com.bytebank.banco.testes;

public class TesteString {

// string é imutavél. 
// para fazer alterações deve ser atribuida a uma nova variavel (objeto do tipo string)
	
	public static void main(String[] args) {
		
		
		
		String vazio = "      Alura      ";
		// metodo semelhante ao vba, remove os espaços da esquerda e direita
		
		vazio = vazio.trim();
		String nome = "Alura";
		//metodo para substituir um caracter 
		
		nome = nome.replace('a','o');
		// metodo que retorna o indice da posição de um caracter especifico.
		
		
		int pos = nome.indexOf("ur");
		
		// metodo que retorna  a quantidade de caracteres na string
		int tamanho = nome.length();
		//metodo que deixa tudo em letra minuscula
		nome = nome.toLowerCase();
		// metodo que retorna um boolean na busca por uma string
	    boolean busca = vazio.contains("Alura");
		
		System.out.println(pos);
		System.out.println(nome);
		System.out.println(vazio);
		System.out.println(tamanho);
		System.out.println(busca);
	}

}
	
	
	

