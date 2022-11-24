package br.com.alura.rh.model.service.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface Reajuste {

	LocalDate data();
	BigDecimal valor();
	
	

}