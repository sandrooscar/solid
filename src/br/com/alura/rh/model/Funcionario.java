package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import br.com.alura.rh.ValidacaoException;

public class Funcionario {

	private DadosPessoais dadosPessoais = new DadosPessoais();
	
	private LocalDate dataUltimoReajuste;

	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.dadosPessoais.nome = nome;
		this.dadosPessoais.cpf = cpf;
		this.dadosPessoais.cargo = cargo;
		this.dadosPessoais.salario = salario;
	}

	public void reajustarSalario(BigDecimal aumento) {
		BigDecimal percentualReajuste = aumento.divide(dadosPessoais.salario, RoundingMode.HALF_UP);
		System.out.println(percentualReajuste);
		if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
		}
		this.dadosPessoais.salario = this.dadosPessoais.salario.add(aumento);
		this.dataUltimoReajuste = LocalDate.now();
	}

	public String getNome() {
		return dadosPessoais.nome;
	}

	public void setNome(String nome) {
		this.dadosPessoais.nome = nome;
	}

	public String getCpf() {
		return dadosPessoais.cpf;
	}

	public void setCpf(String cpf) {
		this.dadosPessoais.cpf = cpf;
	}

	public Cargo getCargo() {
		return dadosPessoais.cargo;
	}

	public void setCargo(Cargo cargo) {
		this.dadosPessoais.cargo = cargo;
	}

	public BigDecimal getSalario() {
		return dadosPessoais.salario;
	}

	public void setSalario(BigDecimal salario) {
		this.dadosPessoais.salario = salario;
	}

	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
		this.dataUltimoReajuste = dataUltimoReajuste;
	}

	public void atualizarSalario(BigDecimal salarioAtualizado) {
		this.dadosPessoais.salario = salarioAtualizado;
		this.dataUltimoReajuste  = LocalDate.now();
	}

	public void promover(Cargo novoCargo) {
		this.dadosPessoais.cargo = novoCargo;
	}

}
