package algaworksOO;

import java.util.Scanner;

public class MultaVeiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Tipo do veiculo (passeio, caminhao)");
		String tipoVeiculo = entrada.nextLine();
		
		System.out.println("Velocidade maxima da via");
		int velocidadeMaxima = entrada.nextInt();
		
		System.out.println("Velocidade do veiculo");
		int velocidadeVeiculo = entrada.nextInt();
		
		if ((tipoVeiculo.equals("passeio") && velocidadeVeiculo > velocidadeMaxima * 1.1)
				|| (tipoVeiculo.equals("caminhao") && velocidadeVeiculo > velocidadeMaxima * 1.05)) {
			System.out.println("Multa");
		}
		
	}

}
