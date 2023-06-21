package aplication;

import java.util.InputMismatchException;
import java.util.Scanner;

import xadrez.PartidaXadrez;
import xadrez.XadrezExcecao;
import xadrez.XadrezPeca;
import xadrez.XadrezPosicao;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PartidaXadrez px = new PartidaXadrez();

		while (true) {

			try {

				UI.limparTela();
				UI.imprimirPartida(px);
				System.out.println();
				System.out.print("Origem: ");
				XadrezPosicao origem = UI.lerPosicaoXadrez(sc);
				boolean[][] possiveisMovimentos = px.possiveisMovimentos(origem);
				UI.limparTela();
				UI.imprimirTabuleiro(px.getPecas(), possiveisMovimentos);
				
				
				System.out.println();

				
				
				System.out.print("Destino: ");
				XadrezPosicao destino = UI.lerPosicaoXadrez(sc);

				XadrezPeca pecaCapturada = px.executarMovimentoPeca(origem, destino);

			} catch (XadrezExcecao e) {
				System.out.println(e.getMessage());
				sc.nextLine();

			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();

			}

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
