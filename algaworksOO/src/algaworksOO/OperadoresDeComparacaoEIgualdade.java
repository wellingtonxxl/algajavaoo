package algaworksOO;

public class OperadoresDeComparacaoEIgualdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 5;
		int c = 2;
		
		boolean maior = b > 5; 
		boolean maiorOuIgual = b >= a;
		boolean menor = a < b;
		boolean menorOuIgual = a <= 10;
		boolean igual = a == b - c;
		boolean diferente = a != c;
		
		System.out.println(maior); //false
		System.out.println(maiorOuIgual); //false
		System.out.println(menor); //false
		System.out.println(menorOuIgual); //true
		System.out.println(igual); //false
		System.out.println(diferente); //true
	
		
		
		boolean bloqueado = false;
		
		//Operador unario
		bloqueado = !bloqueado;
		
		System.out.println("\n"+bloqueado);
		
		
	}

}
