package algaworks.OO.parte1;

public class ExemploThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carro carro = new Carro();
		
		carro.modelo = "Palio";
		System.out.println("Modelo: "+carro.modelo);
		
		carro.alterarModelo("Civic");
		
		System.out.println("Novo Modelo: "+carro.modelo);

	}

}
