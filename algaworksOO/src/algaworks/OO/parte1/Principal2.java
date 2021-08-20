package algaworks.OO.parte1;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carro meuCarro = new Carro();
		meuCarro.anoDeFabricacao = 2019;
		meuCarro.cor = "Prata";
		meuCarro.fabricante = "Fiat";
		meuCarro.modelo = "Argo";
		//meuCarro.dono = dono;
		
		
		meuCarro.dono = new Proprietario();
		meuCarro.dono.nome = "joão da Silva";
		meuCarro.dono.cpf = "999.333.000-23";
		meuCarro.dono.idade = 25;
		meuCarro.dono.logradouro = "Rua João Pinheiro, 02";
		meuCarro.dono.bairro = "Centro";
		meuCarro.dono.cidade = "Uberlandia";
		
	}

}
