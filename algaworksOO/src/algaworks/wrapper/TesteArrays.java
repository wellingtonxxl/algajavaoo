package algaworks.wrapper;

import algaworks.OO.parte1.Carro;

public class TesteArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro[] carros = new Carro[4];
		
		carros[0] = new Carro();
		carros[0].anoDeFabricacao = 2011;
		
		System.out.println("Ano de fabricação: "+carros[0].anoDeFabricacao);
		
		
		int [] notas = new int[4];
		
		notas[0] = 10;
		notas[1] = 5;
		notas[2] = 8;
		notas[3] = 9;
				
		System.out.println("Nota do primeiro aluno: "+notas[0]);
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Posição[" +i+"] = " +notas[i]);
		}
		
	}

}
