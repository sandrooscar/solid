package br.com.alura.rh.model.service.promocao;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class PromocaoService {

	public void promover(Funcionario funcionario, boolean metaBatida) {
		Cargo cargoAtual = funcionario.getCargo();
		if (Cargo.GERENTE.equals(cargoAtual)) {
			throw new ValidacaoException("Gerentes n�o pdoem ser promovidos!");
		}
		
		if (metaBatida) {
			Cargo novoCargo = cargoAtual.getProximoCargo();
			funcionario.promover(novoCargo);
		} else {
			throw new ValidacaoException("Funcion�rio n�o bateu a meta para ser promovido!");
		}
	}
}
