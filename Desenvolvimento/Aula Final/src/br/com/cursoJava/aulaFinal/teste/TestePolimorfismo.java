package br.com.cursoJava.aulaFinal.teste;
import br.com.cursoJava.aulaFinal.modelo.*;

public class TestePolimorfismo {
	public static void main(String[] args) {
		Funcionario vinicius = new Funcionario("Vinicius", "1234", 1000);
		FuncionarioEstrangeiro estrangeiro = new FuncionarioEstrangeiro("Rafa", "31231");
		
		Pessoa enzo = new Funcionario("Vinicius", "1234", 1000);
		
		System.out.println(vinicius.getSalario());
		System.out.println(vinicius.calculaImpostoRenda(vinicius.getSalario()));
		System.out.println(enzo.calculaImpostoRenda(1000));
		aumentoImpostoIPVA(vinicius);
	}
	public static int aumentoImpostoIPVA(Pessoa pessoa) {
		int impostoNovo = pessoa.getImpostoIPVA() + 200;
		pessoa.setImpostoIPVA(impostoNovo);
		
		return impostoNovo;
	}
}
