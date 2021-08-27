package com.algaworks.exemplo;

import java.util.List;

import com.algaworks.dao.FaturaDAO;
import com.algaworks.modelo.Fatura;

public class TesteStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Fatura> faturas = new FaturaDAO().buscarFaturasVencidas();
		
		//Antes do Java 8
		/*
		for (Fatura f : faturas) {
			if (f.getValor() > 250.0) {
				System.out.println("Alerta: Fatura acima de R$ 250.0 -> "+f);
			}
		}*/
		
		faturas.stream()
			.filter(Fatura::estaEmRisco)
			.forEach(System.out::println);	
	}
}
