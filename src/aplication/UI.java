package aplication;

import xadrez.PartidaXadrez;
import xadrez.XadrezPeca;

public class UI {

	public static void imprimirTabuleiro(XadrezPeca[][] xadrezPecas) {
		for(int i = 0;i<xadrezPecas.length;i++) {
			System.out.print(8 - i + " ");
			for(int j=0;j<xadrezPecas.length;j++) {
				printPeca(xadrezPecas[i][j]);
			}
			System.out.println();
		}
		System.out.print("  a b c d e f g h");
	}
	
	private static void printPeca(XadrezPeca peca) {
		if(peca == null) {
			System.out.print("-");
		} else {
			System.out.print(peca);
		}
		System.out.print(" ");
	}
}
