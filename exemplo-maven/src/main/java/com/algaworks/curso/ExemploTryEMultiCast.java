package com.algaworks.curso;

import java.util.Scanner;

public class ExemploTryEMultiCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Java 7 irá fechar o Scanner sem a necessidade de usar entrada.close();
		try (Scanner entrada = new Scanner(System.in)){
		
			System.out.print("Informe seu nome: ");
			String nome = entrada.nextLine();
			
			System.out.print("Informe sua idade: ");
			String idade = entrada.nextLine();
			
			try {
				SalvarAluno.salvar(nome, idade);
			}catch (NegocioException | NumberFormatException e) {
				System.err.println("Impossível completar operação. Motivo: " + e.getMessage());
			}
		}
	}
}
