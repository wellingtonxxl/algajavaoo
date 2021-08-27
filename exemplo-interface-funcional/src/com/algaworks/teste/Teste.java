package com.algaworks.teste;

import com.algaworks.compra.Compra;
import com.algaworks.impressao.Impressora;
import com.algaworks.impressao.impressoras.ImpressoraHP;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Impressora i = new ImpressoraHP();
		
		
		Impressora i = (c) -> {
			System.out.println("Simulando a impressão. Seria impresso: " +c);
			System.out.println();
		};
				
		Compra compra = new Compra("Sabonete", 2.50);
		i.imprimir(compra);
				
	}

}
