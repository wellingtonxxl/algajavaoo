package com.algaworks.curso;

public class ExemploSeparadorDigitosLiterais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long populacaoSaoPaulo = 11_000_000L;
		long populacaoGrandeSaoPaulo = 11_000_000 + 9_000_000;
		
		System.out.printf("População São Paulo: %d\n", populacaoSaoPaulo);
		System.out.printf("População São Paulo: %d\n", populacaoGrandeSaoPaulo);
		
		double precoVeiculo = 200_00.99_1d;
		System.out.printf("Preço veículo: %.3f\n", precoVeiculo);
		
		//Evite usar assim
		int x = 1__2__3;
		int y = 1_2_3;
		System.out.printf("São iguais? %b\n", (x == y));
		
	}

}
