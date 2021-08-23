package com.algaworks.curso.fjoo.modificadorstatic;

public class TesteContador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contador c = new Contador();
		
		c.incrementar();
		System.out.println(Contador.COUNT);
		
		Contador.COUNT++;
		System.out.println(c.COUNT); //*** c.count
		
		imprimirContador();
		
	}

	public static void imprimirContador() {
		System.out.println("O valor do contador agora é: " +Contador.COUNT);
	}
	
}
