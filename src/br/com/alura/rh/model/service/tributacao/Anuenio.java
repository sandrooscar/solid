package br.com.alura.rh.model.service.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Anuenio implements Reajuste {

	private BigDecimal valor;
	private LocalDate data;
	
	
	public Anuenio(BigDecimal valor) {
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
	

}
