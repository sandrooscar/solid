package br.com.alura.rh.model.service.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Promocao implements ReajusteTributavel {
	private BigDecimal valor;
	private LocalDate data;
	
	public Promocao(BigDecimal valor) {
		this.valor = valor;
		this.data = LocalDate.now();
	}

	@Override
	public LocalDate data() {
		return data;
	}

	@Override
	public BigDecimal valor() {
		return valor;
	}

	@Override
	public BigDecimal valorImpostoRenda() {
		return valor.multiply(new BigDecimal("0.1"));
	}
	
}
