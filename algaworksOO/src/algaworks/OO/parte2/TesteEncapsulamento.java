package algaworks.OO.parte2;

public class TesteEncapsulamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArCondicionado ar = new ArCondicionado();
		
		ar.trocarTemperatura(21);
		System.out.println("Temperatura do ar: " +ar.obterTemperatura()+"º");
		
		ar.trocarTemperatura(10);
		System.out.println("Temperatura do ar: " +ar.obterTemperatura()+"º");
		
	}

}
