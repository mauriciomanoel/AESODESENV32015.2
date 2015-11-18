package br.aeso.aula24;
public class ProgramaCalculoImposto {
	public static void main(String[] args) {
		Funcionario funcionario, outroFuncionario;
		
		funcionario = new Funcionario(Funcionario.DESENVOLVEDOR, 2100);
		System.out.println(funcionario.calcularSalarioComImposto());
		
		outroFuncionario = new Funcionario(Funcionario.DESENVOLVEDOR, 1700);
		System.out.println(outroFuncionario.calcularSalarioComImposto());
	}
}
