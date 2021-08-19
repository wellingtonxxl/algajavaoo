package algaworksOO;

import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		String indicacao = (idade >= 18) ? "adulto" : "crianca/adolescente";
		
		
		System.out.println("Resultado: " +indicacao);
		
	}

}
