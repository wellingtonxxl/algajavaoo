package com.algaworks.algafood.di.notificacao;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

@Component
public class NotificadorEmail implements Notificador{

	public NotificadorEmail() {
		System.out.println("Notificador Email");
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail: %s\n",
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
	
}
