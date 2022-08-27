package Geometria;
/**
 * 
 * 
 * 
 * @author DiegoPC
 * 
 */
//import java.math.RoundingMode;
import java.text.DecimalFormat;

public class CriaForma {
	public static void main(String[] args) {

		Quadrado retangulo = new Quadrado();
		Triangulo equilatero = new Triangulo();
		Triangulo isosceles = new Triangulo();
		Triangulo escaleno = new Triangulo();
		Circulo circulo = new Circulo();
		
		//objeto criado para fazer arredondamento de atributos
		//do tipo double
		DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
		//caso deseje truncar o valor, utilize:
		//decimalFormat.setRoundingMode(RoundingMode.DOWN);
		//lembre de descomentar a biblioteca "RoundingMode" tamb�m		
		retangulo.setComprimento(15);
		retangulo.setLargura(10);
		retangulo.setNome("Retangulo");
		System.out.println("Nome: " + retangulo.getNome());
		System.out.println("Area: " + decimalFormat.format(retangulo.area()));
		System.out.println("Perimetro: " + decimalFormat.format(retangulo.perimetro()));
		System.out.println("-----------------------------------");
		
		
		
		equilatero.setAltura(10);
		equilatero.setBase(15);
		equilatero.setLadoA(12.5);
		equilatero.setLadoB(12.5);
		equilatero.setLadoC(12.5);
		equilatero.setNome("Equilatero");
		System.out.println("Nome: " + equilatero.getNome());
		System.out.println("Area: " + decimalFormat.format(equilatero.area()));
		System.out.println("Perimetro: " + decimalFormat.format(equilatero.perimetro()));
		System.out.println("-----------------------------------");
		
		
		
		isosceles.setAltura(15);
		isosceles.setBase(20);
		isosceles.setLadoA(12.5);
		isosceles.setLadoB(12.5);
		isosceles.setLadoC(10);
		isosceles.setNome("Isosceles");
		System.out.println("Nome: " + isosceles.getNome());
		System.out.println("Area: " + decimalFormat.format(isosceles.area()));
		System.out.println("Perimetro: " + decimalFormat.format(isosceles.perimetro()));
		System.out.println("-----------------------------------");
		
		
		
		escaleno.setAltura(20);
		escaleno.setBase(25);
		escaleno.setLadoA(15);
		escaleno.setLadoB(12.5);
		escaleno.setLadoC(10);
		escaleno.setNome("Escaleno");
		System.out.println("Nome: " + escaleno.getNome());
		System.out.println("Area: " + decimalFormat.format(escaleno.area()));
		System.out.println("Perimetro: " + decimalFormat.format(escaleno.perimetro()));
		System.out.println("-----------------------------------");
		
		
		
		circulo.setRaio(3);
		circulo.setNome("Circulo");
		System.out.println("Nome: " + circulo.getNome());
		System.out.println("Area: " + decimalFormat.format(circulo.area()));
		System.out.println("Perimetro: " + decimalFormat.format(circulo.perimetro()));
		System.out.println("-----------------------------------");
	}
}
