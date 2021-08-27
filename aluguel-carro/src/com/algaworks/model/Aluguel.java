package com.algaworks.model;

import java.time.Duration;
import java.time.LocalDateTime;

public class Aluguel {

	private Cliente cliente;
	private Carro carro;
	
	private LocalDateTime dataEHoraDaRetirada;
	private LocalDateTime dataEHoraPreivstaParaDevolucao;
	private LocalDateTime dataEHoraRealDaDevolucao;
	public Aluguel(Cliente cliente, Carro carro, LocalDateTime dataEHoraDaRetirada,
			LocalDateTime dataEHoraPreivstaParaDevolucao) {
		this.cliente = cliente;
		this.carro = carro;
		this.dataEHoraDaRetirada = dataEHoraDaRetirada;
		this.dataEHoraPreivstaParaDevolucao = dataEHoraPreivstaParaDevolucao;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	public LocalDateTime getDataEHoraDaRetirada() {
		return dataEHoraDaRetirada;
	}
	public void setDataEHoraDaRetirada(LocalDateTime dataEHoraDaRetirada) {
		this.dataEHoraDaRetirada = dataEHoraDaRetirada;
	}
	public LocalDateTime getDataEHoraPreivstaParaDevolucao() {
		return dataEHoraPreivstaParaDevolucao;
	}
	public void setDataEHoraPreivstaParaDevolucao(LocalDateTime dataEHoraPreivstaParaDevolucao) {
		this.dataEHoraPreivstaParaDevolucao = dataEHoraPreivstaParaDevolucao;
	}
	public LocalDateTime getDataEHoraRealDaDevolucao() {
		return dataEHoraRealDaDevolucao;
	}
	public void setDataEHoraRealDaDevolucao(LocalDateTime dataEHoraRealDaDevolucao) {
		this.dataEHoraRealDaDevolucao = dataEHoraRealDaDevolucao;
	}
	
	public void imprimeFatura() {
		Duration duration = Duration.between(dataEHoraPreivstaParaDevolucao, dataEHoraRealDaDevolucao);
		System.out.println(">>>>>>>>>>>>>>>>>Fatura<<<<<<<<<<<<<<");
		if(!duration.isNegative()) {
			double multa = duration.toHours() * carro.getValorDiaria() * 0.1;
			System.out.printf("Valor da multa: R$ %.2f. Pois você atrasou %d dias ", multa, duration.toHours());
		}else {
			System.out.println("Obrigado. Você foi pontual.");
		}
	}
}
