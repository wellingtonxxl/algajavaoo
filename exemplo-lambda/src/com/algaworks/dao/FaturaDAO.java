package com.algaworks.dao;

import java.util.ArrayList;
import java.util.List;

import com.algaworks.modelo.Fatura;

public class FaturaDAO {

	public List<Fatura> buscarFaturasVencidas(){
		
		//O ideal é buscar no banco de dados
		List<Fatura> faturas = new ArrayList<>();
		faturas.add(new Fatura("joao@joao.com", 350.0));
		faturas.add(new Fatura("maria@maria.com", 270.0));
		faturas.add(new Fatura("pedro@pedro", 380.0));
		
		return faturas;
	}
	
}
