package br.com.alura.rh.model.service.tributacao;

import java.math.BigDecimal;

public interface ReajusteTributavel extends Reajuste {

	BigDecimal valorImpostoRenda();
}
