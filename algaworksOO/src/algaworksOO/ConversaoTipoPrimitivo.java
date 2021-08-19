package algaworksOO;

public class ConversaoTipoPrimitivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long x = 9300000035L; //variavel de 64 bits
		
		// casting
		int y = (int) x; //variavel de 32bits
		//valor será diferente do que foi declarado
		System.out.println(y);
		
		double largura = 100;
		int tamanho = (int) largura;
		System.out.println(tamanho);
		
	}

}
