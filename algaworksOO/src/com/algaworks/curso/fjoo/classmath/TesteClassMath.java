package com.algaworks.curso.fjoo.classmath;

import static java.lang.Math.PI;
import static java.lang.Math.max;
import static java.lang.Math.min;

public class TesteClassMath {
	
	public static void main(String[] args) {
		// Comprimento de uma circunferência 2 x r x PI (3.14)
		int raio = 4;		
		double comprimento = 2 * raio * PI;
		System.out.println("Comprimento: " +comprimento);

		//Maximo e minimo
		double [] precosProdutoA = {30.20, 25.49};
		
		System.out.println("Maior preço: " +max(precosProdutoA[0], precosProdutoA[1]));
		System.out.println("Menor preço: " +min(precosProdutoA[0], precosProdutoA[1]));
		
		//Potência
		System.out.println("2^3: "+ Math.pow(2, 3));
		
		//Raiz quadrada
		System.out.println("Raiz de 9: " +Math.sqrt(9));
		
		//Arrendondamento ceil, floor e round
		double n = 5.68;
		System.out.println("Menor inteiro: " +Math.floor(n));
		System.out.println("Maior inteiro: " +Math.ceil(n));
		System.out.println("Arredondando: " +Math.round(n));
		
		//Trigonometria
		System.out.println("Seno: " +Math.sin(40));
		
		//Numeros randomicos
		double numeroAleatorio = Math.random() * 100;
		System.out.println(numeroAleatorio);

	}

}
