package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Terceirizado {

	private DadosPessoais dadosPessoais = new DadosPessoais();

	private String empresa;

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
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

}
