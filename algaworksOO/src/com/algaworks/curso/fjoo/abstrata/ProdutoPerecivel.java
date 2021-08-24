package com.algaworks.curso.fjoo.abstrata;

public class ProdutoPerecivel  extends Produto{

	String descricao;
	String dataValidade;
	
	public void imprimirDescricao() {

		System.out.println("Descrição: " +super.getDescricao()+ ". Vencendo em: "+ dataValidade);
		
	}

}
