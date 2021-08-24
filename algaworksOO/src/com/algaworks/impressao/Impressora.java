package com.algaworks.impressao;

public interface Impressora {
	
	//Todos os metodos são public abstract, mesmo que não esteja explicito,por exemplo, //public abstract void imprimir();
	
	public void imprimir(Imprimivel imprimivel);

}
