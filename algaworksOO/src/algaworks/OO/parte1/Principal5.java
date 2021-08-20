package algaworks.OO.parte1;

public class Principal5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Preco preco = new Preco();
		preco.valorCustos = 140;
		
		Produto produto = new Produto();
		produto.definirPreco(preco, 20, 15);
		
		System.out.println("Valor custos: "+preco.valorCustos);
		System.out.println("Valor impostos: " +preco.valorImpostos);
		System.out.println("Valor lucro; "+preco.valorLucro);
		System.out.println("Preço venda: "+preco.precoVenda);
	}

}
