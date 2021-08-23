package com.algaworks.curso.fjoo.enums;

public class TesteOperacaoEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OperacaoAritmetica op1 = OperacaoAritmetica.ADICAO;
		
		int resultado1 = op1.operacao(5, 3);
		
		System.out.println("O resultado é: "+resultado1);
		
		for (OperacaoAritmetica oa : OperacaoAritmetica.values()) {
			System.out.println(oa + " -> " + oa.operacao(4, 2));
		}
		
	}

}
