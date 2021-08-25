package com.algaworks.curso.fjoo.numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;

public class TesteNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
		double valorProduto = 1300.59;
		System.out.println(valorProduto);
		System.out.println(formatador.format(valorProduto));
	
		String entrada = "R$ 50,34";
		
		try {
			double numero = formatador.parse(entrada).doubleValue();
			System.out.println(numero);
		}catch(ParseException e){
			System.out.println("Entrada inválida!");
		}
		
		BigDecimal bg = new BigDecimal(513123412000d);
		bg = bg.divide(BigDecimal.TEN);
		
		System.out.println(bg);
		
	}

}
