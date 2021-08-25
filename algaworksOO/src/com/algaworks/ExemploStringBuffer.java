package com.algaworks;

public class ExemploStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//StringBuffer sb = new StringBuffer(); // usar em caso de concorrencia, pq ele é thread-safe
		StringBuilder sb = new StringBuilder(); // não-thread-safe - é mais rápido
		
		sb.append("Bem vindo ao curso de Java.");
		sb.append("Fique a vontade para tirar suas dúvidas.");
		sb.append("Estamos aqui para te ajudar.");
		
		System.out.println(sb.toString());
		
		sb.insert(26, " da Algaworks");
		System.out.println(sb);
		
		
	}

}
