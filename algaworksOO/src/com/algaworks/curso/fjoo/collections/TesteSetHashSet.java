package com.algaworks.curso.fjoo.collections;

import java.util.HashMap;
import java.util.Map;

public class TesteSetHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno a1 = new Aluno("João");
		Aluno a2 = new Aluno("Maria");
		Aluno a3 = new Aluno("José");
		Aluno a4 = new Aluno("Pedro");
		
		Map<String, Aluno> alunos = new HashMap<String, Aluno>();
		
		alunos.put("1", a1);
		alunos.put("2", a2);
		alunos.put("3", a3);
		alunos.put("4", a4);
		
		imprimirAlunos(alunos);
	}
	
	public static void imprimirAlunos(Map<String, Aluno> alunos) {
		for (Aluno a : alunos.values()) {
			System.out.println("Nome: "+a.getNome());
		}
	}

}
