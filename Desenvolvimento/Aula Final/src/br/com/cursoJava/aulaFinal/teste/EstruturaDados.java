package br.com.cursoJava.aulaFinal.teste;

public class EstruturaDados {
	public static void main(String[] args) {
		
		int numeros[] = new int[10];
		char caracteres[] = {'v','i','n','i','c', 'i', 'u', 's'};
		System.out.println(caracteres.length);
		for(int i = 0 ; i < numeros.length ; i++) {
			numeros[i] = i;
		}
		for(int i = 0 ; i < numeros.length ; i++) {
			System.out.print(numeros[i] + " ");
		}
	}
}
