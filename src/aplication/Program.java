package aplication;

<<<<<<< HEAD
import java.util.InputMismatchException;
import java.util.Scanner;

import xadrez.PartidaXadrez;
import xadrez.XadrezExcecao;
=======
import java.util.Scanner;

import xadrez.PartidaXadrez;
>>>>>>> 2d85e3300469964d65f29f7a9bf5f78a9bd1c009
import xadrez.XadrezPeca;
import xadrez.XadrezPosicao;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PartidaXadrez px = new PartidaXadrez();

		while (true) {
<<<<<<< HEAD
			try {

				UI.limparTela();
				UI.imprimirTabuleiro(px.getPecas());
				System.out.println();
				System.out.print("Origem: ");
				XadrezPosicao origem = UI.lerPosicaoXadrez(sc);
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
=======
			UI.imprimirTabuleiro(px.getPecas());
			System.out.println();
			System.out.println("Origem: ");
			XadrezPosicao origem = UI.lerPosicaoXadrez(sc);
			System.out.println();

			System.out.println("Destino: ");
			XadrezPosicao destino = UI.lerPosicaoXadrez(sc);

			XadrezPeca pecaCapturada = px.executarMovimentoPeca(origem, destino);

>>>>>>> 2d85e3300469964d65f29f7a9bf5f78a9bd1c009
		}
	}

}
