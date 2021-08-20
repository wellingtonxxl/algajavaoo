package algaworks.OO.parte1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro meuCarro = new Carro(); 
		Carro seuCarro = new Carro();
		
		meuCarro.fabricante = "Fiat";
		meuCarro.modelo = "Argo";
		meuCarro.anoDeFabricacao = 2019;
		meuCarro.cor = "Branco";
		
		seuCarro.fabricante = "Honda";
		seuCarro.modelo = "Civic G10";
		seuCarro.anoDeFabricacao = 2021;
		seuCarro.cor = "Cinza";
		
		System.out.println("Meu Carro");
		System.out.println("-----------------------");
		System.out.println("Fabricante: "+meuCarro.fabricante);
		System.out.println("Modelo: "+meuCarro.modelo);
		System.out.println("Ano: "+meuCarro.anoDeFabricacao);
		System.out.println("Cor: "+meuCarro.cor);
		
		System.out.println();
		System.out.println("Seu carro");
		System.out.println("-----------------------");
		System.out.println("Fabricante: "+seuCarro.fabricante);
		System.out.println("Modelo: "+seuCarro.modelo);
		System.out.println("Ano: "+seuCarro.anoDeFabricacao);
		System.out.println("Cor: "+seuCarro.cor);
		
	}

}
