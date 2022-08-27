package br.com.cursoJava.aulaFinal.modelo;

public abstract class Pessoa {
	private String nome;
	private String cpf;
	private int impostoIPVA = 800;
	public double calculaImpostoRenda(double salario) {
		double resultado = salario * 0.2;
		return resultado;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getImpostoIPVA() {
		return impostoIPVA;
	}

	public void setImpostoIPVA(int impostoIPVA) {
		this.impostoIPVA = impostoIPVA;
	}
	
}
