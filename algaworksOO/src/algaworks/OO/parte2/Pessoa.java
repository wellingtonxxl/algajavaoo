package algaworks.OO.parte2;

public class Pessoa {

	String nome;
	int idade;

	Pessoa(String nome){
		this.nome = nome;
	}
	
	Pessoa(String nome, int idade){
		this(nome); //Deve ser a primeira instrução dentro do construtor		
		this.idade = idade;
	}
	
}
