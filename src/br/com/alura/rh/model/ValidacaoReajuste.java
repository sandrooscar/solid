package br.com.alura.rh.model;

import java.math.BigDecimal;

public interface ValidacaoReajuste {
	
	public void validacao(Funcionario funcionario, BigDecimal aumento); 
}
