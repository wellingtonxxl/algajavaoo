package com.algaworks.curso.iostream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GravandoEmails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] emails = {"joao@joao.com", "maria@maria.com", "pedro@pedro.com"};
				
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("emails.txt", true))){ //default é false e não faz append no arquivo
			
			for(String email: emails) {
				writer.write(email);
				writer.newLine();
			}
		}catch (IOException e) {
			System.err.println("Não foi possível gravar o arquivo." +e.getMessage());
		}

	}

}
