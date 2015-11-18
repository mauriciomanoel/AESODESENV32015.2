package br.aeso.aula24;

public class CalculoImpostoQuinzeOuDez implements CalculaImposto {
	@Override
	public double calculaSalarioComImposto(Funcionario funcionario) {
		if (funcionario.getSalarioBase() > 2000) {
			return funcionario.getSalarioBase() * 0.85;
		}
		return funcionario.getSalarioBase() * 0.9;
	}
}
