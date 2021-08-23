package com.algaworks.curso.fjoo.modificadorstatic;

public class Contador {

	
	//As coisas static ficam sempre na Class e são compartilhadas com todos os objetos
	public static int COUNT = 0;
	public static final double PI = 3.14; //final nunca muda
	
	public void incrementar() {
		COUNT++;
	}
	
}
