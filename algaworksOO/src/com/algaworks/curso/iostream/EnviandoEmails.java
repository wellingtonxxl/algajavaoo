package com.algaworks.curso.iostream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EnviandoEmails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedReader reader = new BufferedReader(new FileReader("emails.txt"))){
			
			String email = reader.readLine();
			while(email != null && !email.trim().equals("")) {
				System.out.println("Enviando e-mail para: "+email);
				email = reader.readLine();
			}
			
		}catch (IOException e) {
			System.err.println("Não consegui ler o arquivo. Erro: "+e.getMessage());
		}
		
	}

}
