package br.com.cursoJava.aulaFinal.teste;

public class EstruturasCondicionais {
	public static void main(String[] args) {
		
		boolean jaChoveuHoje = true;
		
		if(jaChoveuHoje)
			System.out.println("Eba chuva muito boa");
		else
			System.out.println("Aff queria um banho de chuva");
		int numero = 17;
		
		if (numero > 18)
			System.out.println("Sou maior de dezoito, ja posso beber");
		else if(numero == 18)
			System.out.println("Opa dezoitei!!");
		else
			System.out.println("Aff ainda nao posso beber");
		
		boolean jaTomeiAguaHoje = true;
		boolean jaTomeiBanhoHoje = true;
		boolean jaEstudeiHoje = false;
		
		if(jaTomeiAguaHoje && jaTomeiBanhoHoje)
			System.out.println("Estou limpo e hidratado");
		if(jaTomeiAguaHoje || jaTomeiBanhoHoje)
			System.out.println("Fedido,porem hidratado");
		if((jaTomeiAguaHoje || jaTomeiBanhoHoje) && jaEstudeiHoje)
			System.out.println("Inteligente e hidratado");
		if(!jaEstudeiHoje)
			System.out.println("Nao sou inteligente");
	}
}
