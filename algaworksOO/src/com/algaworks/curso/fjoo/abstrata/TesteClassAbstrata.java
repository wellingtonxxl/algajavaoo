package com.algaworks.curso.fjoo.abstrata;

public class TesteClassAbstrata {

	public static void main(String[] args) {

		Produto p = new ProdutoPerecivel();
		p.descricao = "Caixa de Leite";
		
		ProdutoPerecivel pp = (ProdutoPerecivel) p;
		pp.dataValidade = "24/08/2021";
		
		p.imprimirDescricao();
		
	}

}
