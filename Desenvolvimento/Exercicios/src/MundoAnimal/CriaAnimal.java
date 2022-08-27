package MundoAnimal;

public class CriaAnimal {
	public static void main(String[] args) {
		
		Cachorro doguinho = new Cachorro();
		
		doguinho.cor = "Branco";
		doguinho.nome = "Toy";
		doguinho.peso = 8.56 ;
		doguinho.raca = "Poodle";
		doguinho.sexo = "Macho";
		doguinho.tamanho = 0.76;
		
		doguinho.qtdPatas = 4 ;
		doguinho.tamanhoCauda = 0.05;
		
		MostraAnimais.mostra_bicho(doguinho);
		
		Passaro pinguim = new Passaro();
		
		pinguim.cor = "Branco com preto";
		pinguim.nome = "Jorge";
		pinguim.peso = 23.42;
		pinguim.raca = "Pinguim-imperador";
		pinguim.sexo = "Macho";
		pinguim.tamanho = 1.2;
		
		pinguim.podeVoar = false;
		pinguim.tamanhoBico = 0.03;
		pinguim.qtdP�s = 2;
		
		MostraAnimais.mostra_bicho(pinguim);
	}

}
