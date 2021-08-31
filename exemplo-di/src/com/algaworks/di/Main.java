package com.algaworks.di;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.notificacao.Notificador;
import com.algaworks.di.notificacao.NotificadorSMS;
import com.algaworks.di.service.AtivacaoClienteService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente joao = new Cliente("João", "joao@xyz.com.br", "93883393");
		Cliente maria = new Cliente("Maria", "maria@xyz.com.br", "3978737633");
		
		Notificador notificador = new NotificadorSMS();
		//Notificador notificador = new NotificadorEmail();
		
		AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificador);
		ativacaoCliente.ativar(joao);
		ativacaoCliente.ativar(maria);
		
	}

}
