package Usuario;

import java.util.Scanner;

public class CadastroClientes {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de clientes que ser�o cadastrados: ");
		int qtdClientes = sc.nextInt();
		Cliente[] cliente =  new Cliente[qtdClientes];
		for(int i = 0; i < qtdClientes; i++) {
			
			cliente[i] = new Cliente();
			System.out.println("Digite o nome do cliente " + (i+1) + ":");
			cliente[i].nome = sc.next();
			System.out.println("Digite o CPF do cliente " + (i+1) + ":");
			cliente[i].cpf = sc.next();
			System.out.println("Digite o numero da agencia do cliente ");
			cliente[i].numeroAgencia = sc.nextInt();
			System.out.println("Digite a idade do cliente "+ (i+1) + ":");
			cliente[i].idade = sc.nextInt();
			System.out.println("Digite o saldo do cliente "+ (i+1) + ":");
			cliente[i].saldo = sc.nextDouble();
		}
		System.out.println("Clientes:");
		for(int i = 0; i < qtdClientes ;i++) {
			
			System.out.println(cliente[i].nome);
			System.out.println(cliente[i].cpf);
			System.out.println(cliente[i].numeroAgencia);
			System.out.println(cliente[i].idade);
			System.out.println(cliente[i].saldo);
		}
	}
}
