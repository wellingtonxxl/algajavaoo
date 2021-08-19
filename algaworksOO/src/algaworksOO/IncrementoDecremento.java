package algaworksOO;

public class IncrementoDecremento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 10;
	
		int novaIdade = idade++;
		//int novaIdade = idade--;
		int novaIdade2 = ++idade;
		//int novaIdade2 = --idade;
		
		System.out.println("Idade: "+idade);
		System.out.println("Nova idade: "+novaIdade);
		System.out.println("Nova idade: "+novaIdade2);
	}

}
