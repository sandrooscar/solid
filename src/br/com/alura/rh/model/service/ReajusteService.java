package br.com.alura.rh.model.service;

import java.math.BigDecimal;
import java.util.List;

import br.com.alura.rh.model.Funcionario;
import br.com.alura.rh.model.ValidacaoReajuste;

public class ReajusteService {
	
	private List<ValidacaoReajuste> validacoes; 
	
	public ReajusteService(List<ValidacaoReajuste> validacoes) {
		this.validacoes = validacoes;
	}

	public void reajusteDoFuncionario(Funcionario funcionario, BigDecimal aumento) {
		
		validacoes.forEach(v -> v.validacao(funcionario, aumento));

		funcionario.atualizarSalario(funcionario.getSalario().add(aumento));
	}
}
