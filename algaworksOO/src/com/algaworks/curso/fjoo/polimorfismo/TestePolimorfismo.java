package com.algaworks.curso.fjoo.polimorfismo;

public class TestePolimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta conta = new Conta();
		
		conta.setSaldo(4000);
		imprimirSaldo(conta);
		// ------------------------------------------------
		
		Conta contaCorrente = new ContaCorrente();
		contaCorrente.setSaldo(3500);
		imprimirSaldo(contaCorrente);
		// ------------------------------------------------
		Conta contaPoupanca = new ContaPoupanca();
		contaPoupanca.setSaldo(2000);
		imprimirSaldo(contaPoupanca);

	}
	
	public static void imprimirSaldo(Conta conta) {
		System.out.println("Saldo da conta: R$"+conta.getSaldo());
		
		if(conta instanceof ContaCorrente) {
			ContaCorrente cc = (ContaCorrente) conta;
			System.out.println("O limite da cc é R$: "+ cc.getLimite());
		}
		
		if (conta instanceof ContaPoupanca) {
			ContaPoupanca cp = (ContaPoupanca) conta;
			System.out.println("O rendimento da cp é R$: "+cp.getRendimentos());
		}
		
	}

}
