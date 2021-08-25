package com.algaworks.curso.fjoo.collections;

import java.util.Set;

public class TesteSetHashSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Aluno> alunos = SimuladorBancoDeDados.buscarAlunos();
		
		// De alguma forma, sorteia o nome do aluno e constrói o objeto Aluno
		Aluno alunoSorteado = new Aluno("Maria");
		
		if(alunos.contains(alunoSorteado)) {
			System.out.println("Parabéns: "+alunoSorteado.getNome()+ "! Você ganhou um brinde!");
		}else {
			System.out.println("Aluno não cadastro no banco de dados.");
		}
		
	}

}
