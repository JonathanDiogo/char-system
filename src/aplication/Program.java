package aplication;

import java.util.Scanner;

import xadrez.PartidaXadrez;
import xadrez.XadrezPeca;
import xadrez.XadrezPosicao;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PartidaXadrez px = new PartidaXadrez();

		while (true) {
			UI.imprimirTabuleiro(px.getPecas());
			System.out.println();
			System.out.println("Origem: ");
			XadrezPosicao origem = UI.lerPosicaoXadrez(sc);
			System.out.println();

			System.out.println("Destino: ");
			XadrezPosicao destino = UI.lerPosicaoXadrez(sc);

			XadrezPeca pecaCapturada = px.executarMovimentoPeca(origem, destino);

		}
	}

}
