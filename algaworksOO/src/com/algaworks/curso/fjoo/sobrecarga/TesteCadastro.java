package com.algaworks.curso.fjoo.sobrecarga;

public class TesteCadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CadastroPessoa cadastro = new CadastroPessoa();
		
		Pessoa pessoa = new Pessoa("João", 32);
		cadastro.cadastrar(pessoa);
		// ----------------------------------------
		
		cadastro.cadastrar("Maria", 25);
		
		
	}

}
