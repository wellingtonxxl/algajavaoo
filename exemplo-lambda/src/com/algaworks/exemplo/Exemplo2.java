package com.algaworks.exemplo;

import java.util.List;

import com.algaworks.dao.FaturaDAO;
import com.algaworks.modelo.Fatura;

public class Exemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();
		
		//faturasVencidas.forEach(f -> f.atualizarStatus()); //Com lambda
		
		faturasVencidas.forEach(Fatura::atualizarStatus); //Referencia a métodos com Java8
		
		
	}

}
