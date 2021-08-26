package com.algaworks.curso;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(Scanner entrada = new Scanner(System.in)){
			System.out.println("Informe seu nome: ");
			String nome = entrada.nextLine();
			
			System.out.println("Informe sua idade: ");
			int idade = entrada.nextInt();
			
			Usuario usuario = new Usuario(nome, idade);
			System.out.println("Obrigado, "+usuario.getNome()+ " por se cadastrar.");
		}
		
	}

}
