package algaworksOO;

import java.util.Scanner;

public class EstruturaFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ultimo numero: ");
		int numeroFinal = entrada.nextInt();
		
		for(int i = 1; i <= numeroFinal; i++) {
			System.out.println(i);
		}
	}	
}
