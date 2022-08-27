package Calculadora;

import java.util.Scanner;

public class Calculo {
	public static void main(String[] args) {
		
		//Operador sinal = new Operador();
		Scanner sc = new Scanner(System.in);
		double result = 0;
		boolean quit = true;
		char comparador;
		
		while(quit != false) {
			
			System.out.println("Digite o primeiro numero: ");
			double numero1 = sc.nextDouble();
			System.out.println("Digite a operacao desejada: ");
			String operador = sc.next();
			System.out.println("Digite o segundo numero: ");
			double numero2 = sc.nextDouble();
			
			switch(operador) {
			case "+":
				result = Operador.adicao(numero1, numero2);
				break;
			case "-":
				result = Operador.subtracao(numero1, numero2);
				break;
			case "*":
				result = Operador.multiplicacao(numero1, numero2);
				break;
			case "/":
				result = Operador.divisao(numero1, numero2);
				break;
			default:
				System.out.println("Sinal invalido");
				break;
			}
			
			System.out.println("Resultado: "+ result);
			System.out.println("Deseja sair ?(S para sim, N para Nao)");
			comparador = sc.next().charAt(0);
			if(comparador == 'S' || comparador == 's') {
				quit = false;
			}
			if(comparador == 'N' || comparador == 'n') {
				quit = true;
			}
			System.out.println("Programa finalizado com sucesso");
		}
	}
}