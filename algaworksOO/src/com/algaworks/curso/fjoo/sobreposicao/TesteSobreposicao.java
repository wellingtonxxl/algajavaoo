package com.algaworks.curso.fjoo.sobreposicao;

import java.util.Date;

public class TesteSobreposicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProdutoPerecivel pp = new ProdutoPerecivel();
		pp.descricao = "Caixa de fósforo";
		pp.dataValidade = new Date();
		
		pp.identificar();
		
	}

}
