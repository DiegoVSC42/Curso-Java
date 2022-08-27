package MundoAnimal;

public class MostraAnimais {
	public static void mostra_bicho(Animal bicho) {

		DefineEspecie.especieAnimal(bicho);
		
		System.out.println("Especie do animal: " + bicho.especie);
		System.out.println("Cor do animal: " + bicho.cor);
		System.out.println("Nome do animal: " + bicho.nome);
		System.out.println("Peso do animal: " + bicho.peso + "Kg");
		System.out.println("Ra�a do animal: " + bicho.raca);
		System.out.println("Tamanho do animal: " + bicho.tamanho + "m");
		
		if(bicho instanceof Cachorro) {
			
			Cachorro dog = new Cachorro();
			dog = (Cachorro) bicho;
			System.out.println("Quantidade de patas: " + dog.qtdPatas);
			System.out.println("Tamanho da cauda : " + dog.tamanhoCauda + "m");
		
		}else {
			
			Passaro bird = new Passaro();
			bird = (Passaro) bicho;
			System.out.print("Este animal pode voar ? ");
			if(bird.podeVoar)
				System.out.println("Sim");
			else {
				System.out.println("Nao");
			}
			System.out.println("Tamanho do bico: " + bird.tamanhoBico + "m");
			System.out.println("Quantidade de p�s: " + bird.qtdP�s);
		}
		
		System.out.println("----------------------------------------------");
	}
}
