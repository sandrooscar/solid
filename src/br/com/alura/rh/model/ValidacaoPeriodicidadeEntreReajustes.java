package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.alura.rh.ValidacaoException;

public class ValidacaoPeriodicidadeEntreReajustes implements ValidacaoReajuste {

	@Override
	public void validacao(Funcionario funcionario, BigDecimal aumento) {
		LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
		LocalDate dataAtual = LocalDate.now();
		
		if (ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual) < 6) {
			throw new ValidacaoException("Intervalo entre reajustes deve ser no minimo de 6 meses");	
		}
	}

}
