package aplication;

import xadrez.PartidaXadrez;

public class Program {

	public static void main(String [] args) {
		
		PartidaXadrez px = new PartidaXadrez();
		UI.imprimirTabuleiro(px.getPecas());
		
	}
}
