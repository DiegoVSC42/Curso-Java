package Arrays;

import java.util.Scanner;

public class ArrayNumeros {
	public static void main(String args[]){
		
		int comando = 100;
		int cont_indice = 0;
		int valor;
		int vetor[] = new int[10];
		ArrayNumeros objeto = new ArrayNumeros();
		
		Scanner sc = new Scanner(System.in);

		while (comando != 0) {
			
			System.out.println("Digite o valor referente ao comando desejado:");
			System.out.println("1 - Inserir valor digitado no final do vetor ");
			System.out.println("2 - Remover valor digitado referente ao indice do vetor");
			System.out.println("3 - Mostrar vetor");
			System.out.println("4 - Receber valor referente ao indice do vetor");
			System.out.println("5 - Ordenar vetor");
			System.out.println("6 - Mostrar apenas primos");
			System.out.println("7 - Remover numeros primos");			
			System.out.println("0 - Sair");
			comando = sc.nextInt();
			switch (comando) {
				case 1:
					System.out.println("Digite o valor que ser� inserido: ");
					valor = sc.nextInt();
					objeto.adicionarNumero(vetor, valor, cont_indice);
					cont_indice++;
					System.out.println();
					break;
				case 2:
					System.out.println("Digite o valor referente ao indice que ser� removido");
					valor = sc.nextInt();
					objeto.removerNumero(valor, vetor);
					cont_indice--;
					System.out.println("Valor removido");
					System.out.println();
					break;
				case 3:
					objeto.mostrar(vetor);
					System.out.println();
					break;
				case 4:
					System.out.println("Digite o valor referente ao indice que deseja saber o valor");
					valor = sc.nextInt();
					objeto.receber(vetor, valor);
					System.out.println();
					break;
				case 5:
					objeto.ordenar(vetor);
					System.out.println("Vetor Ordenado com sucesso");
					System.out.println();
					break;
				case 6:
					System.out.println("Mostrando Numeros Primos: ");
					objeto.mostrarPrimos(vetor);
					System.out.println();
					break;
				case 7:
					System.out.println("Removendo Numeros Primos");
					objeto.removerPrimos(vetor);
					System.out.println();
					break;
				case 0:
					System.out.println("Saindo do programa");
					System.out.println();
					break;
				default:
					System.out.println("Valor Inv�lido");
					System.out.println();
					break;
			}
		}
	}
	
	public void adicionarNumero(int vetor[],int numero, int cont_indice){
		vetor[cont_indice] = numero;
	}
	public void removerNumero(int indice, int vetor[]) {
		int aux;
		/*if(indice == vetor.length-1) {
			vetor[vetor.length - 1] = 0;
		}*/
		for(int i = 0 ; i < vetor.length ; i++ ) {
			if(i == indice){
				for(int j = i; j < vetor.length -1 ; j++) {
					aux = vetor[j+1];
					vetor[j] = aux;
				}
			}
		}
		vetor[vetor.length - 1] = 0;
	}
	public void mostrar(int vetor[]){
		System.out.println();
		System.out.print("Vetor: ");
		for(int i = 0 ; i < vetor.length ; i++) {
			System.out.print("[" + vetor[i] + "]");
		}
		System.out.println();
	}	
	public void receber(int vetor[],int indice) {
		System.out.println("Valor no indice " + indice +" = " + vetor[indice]);
	}
	public void ordenar(int vetor[]) {
		
		for(int i = 0; i < vetor.length; i++){

			int j = i;
          
			while(j > 0 && vetor[j-1]>vetor[j]){
	
		        int key = vetor[j];
		        vetor[j] = vetor[j-1];
		        vetor[j-1] = key;
		        j = j-1; 
	
			}
        }
	}
	public boolean verificaPrimos(int numero) {
		if (numero == 1 || numero == 0)
			return false;
		if (numero == 3)
			return true;
	    for (int j = 2; j < numero; j++) {
	        if (numero % j == 0)
	        	return false;
	    }
	    return true;
	}
	public void mostrarPrimos(int vetor[]) {
		ArrayNumeros objeto = new ArrayNumeros();
		for(int i = 0; i < vetor.length ; i++) {
			if(objeto.verificaPrimos(vetor[i]))
				System.out.print("[" + vetor[i] + "]");
		}
	}
	public void removerPrimos(int vetor[]) {
		ArrayNumeros objeto = new ArrayNumeros();
		for(int i = 0 ; i < vetor.length ; i++) {
			if(objeto.verificaPrimos(vetor[i])) {
				objeto.removerNumero(i, vetor);
			}
		}
	}
}


