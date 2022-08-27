package Geometria;

public class Quadrado implements FiguraGeometrica{
	
	private double comprimento;
	private double largura;
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	@Override
	public double area() {
		double valorArea = comprimento*largura;
		return valorArea;
	}

	@Override
	public double perimetro() {
		double valorPerimetro = (2 * comprimento) + (2 * largura);
		return valorPerimetro;
	}
	

}
