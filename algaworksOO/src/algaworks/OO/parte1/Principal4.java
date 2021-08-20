package algaworks.OO.parte1;

public class Principal4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FolhaPagamento folha = new FolhaPagamento();
		
		double salario = folha.calcularSalario(160, 12, 32.5, 40.2);
		
		System.out.println("Salario calculado: "+salario);
		
		
	}

}
