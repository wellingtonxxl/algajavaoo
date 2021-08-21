package algaworks.wrapper;

public class TestesClassesWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// byte, short, int, long, float, double e char
		// Byte, Short, Intenger, Long, Float, Double e Character
		
		int x = 5;
		Integer i = new Integer(5);
	
		String valor = "15.5";
		//Float v = new valueOf(valor); //Float.valueOf((float)value).
		int idade = Integer.parseInt("27");
		
		try {
			double custo = Double.parseDouble("Vinte e tres reais");
			System.out.println("Custo total: "+custo);
		}catch (NumberFormatException e) {
			System.err.println("Numero inválido para conversão!");
		}
		
				
	}

}
