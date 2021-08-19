package algaworksOO;

import java.util.Scanner;

public class PagamentoIpva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o final da placa: ");
		int finalPlaca = entrada.nextInt();
		
		switch(finalPlaca) {
		case 1:
			System.out.println("Vencimento dia 11 de Janeiro");
			break;
		case 2:
			System.out.println("Vencimento dia 23 de Fevereiro");
			break;
		case 3:
			System.out.println("Vencimento dia 30 de Março");
			break;
		case 4:
			System.out.println("Vencimento dia 14 de Abril");
			break;
		case 5:
			System.out.println("Vencimento dia 17 de Maio");
			break;
		case 6:
			System.out.println("Vencimento dia 22 de Junho");
			break;
		case 7:
			System.out.println("Vencimento dia 19 de Julho");
			break;
		default:
			System.out.println("Vencimento sem data, desculpe!");
		}
	}

}
