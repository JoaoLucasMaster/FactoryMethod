package view;

import model.*;

public class Main {

	public static void main(String[] args) {
		
		Fabrica FabricaHerbivoro = DecideFabrica.FabricaDeFabricas(1);
		Animal coala = FabricaHerbivoro.Fabricacao(2);
		Animal tartaruga = FabricaHerbivoro.Fabricacao(1);
		
		Fabrica FabricaCarnivoro = DecideFabrica.FabricaDeFabricas(2);
		Animal Leao = FabricaCarnivoro.Fabricacao(2);
		Animal Tubarao = FabricaCarnivoro.Fabricacao(1);
		
		System.out.println(coala.getAlimentacao());
		System.out.println(tartaruga.getAlimentacao());
		System.out.println(Leao.getAlimentacao());
		System.out.println(Tubarao.getAlimentacao());
		
		
		
		
	}

}
