package br.com.alura.rh;

import java.math.BigDecimal;

import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario func = new Funcionario("joao", "123456", Cargo.ANALISTA, new BigDecimal(1000));
		func.reajustarSalario(new BigDecimal(500));
	}

}
