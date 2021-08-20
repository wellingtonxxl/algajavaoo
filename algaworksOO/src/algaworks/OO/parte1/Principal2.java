package algaworks.OO.parte1;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Proprietario dono1 = new Proprietario();
		dono1.nome = "João da Silva";
		
		Carro meuCarro = new Carro();
		meuCarro.modelo = "Argo";
		
		Carro seuCarro = new Carro();
		seuCarro.modelo = "Civic";
		
		meuCarro.ligar();
		seuCarro.ligar();
		
	}

}
