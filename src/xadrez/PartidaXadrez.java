package xadrez;

import java.awt.Color;

import boardgame.Posicao;
import boardgame.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaXadrez {

	private Tabuleiro tabuleiro;
	private int turn;
	private Color atualJogador;
	private boolean verificar;
	private boolean checkMate;
	private XadrezPeca passarJogada;
	private XadrezPeca promovido;
	
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8,8);
		iniciarPartida();
	}
	
	public XadrezPeca[][] getPecas(){
		XadrezPeca[][] matriz =new XadrezPeca[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for(int i=0;i<tabuleiro.getLinhas();i++) {
			for(int j=0;j<tabuleiro.getColunas();j++) {
				matriz[i][j] = (XadrezPeca) tabuleiro.peca(i, j);
			}
		}
		return matriz;
		
	}
	
	private void colocarNovaPeca(char coluna, int linha, XadrezPeca peca) {
		tabuleiro.lugarPeca(peca, new XadrezPosicao(coluna, linha).paraPosicao()); ;
	}
	
	private void iniciarPartida() {

		colocarNovaPeca('a', 1, new Torre(tabuleiro, Cor.BRANCO));
		colocarNovaPeca('b', 1, new Cavaleiro(tabuleiro, Cor.BRANCO));
		colocarNovaPeca('c', 1, new Bispo(tabuleiro, Cor.BRANCO));
		colocarNovaPeca('d', 1, new Rainha(tabuleiro, Cor.BRANCO));
		colocarNovaPeca('e', 1, new rei(tabuleiro, Cor.BRANCO, this));
		colocarNovaPeca('f', 1, new Bispo(tabuleiro, Cor.BRANCO));
		colocarNovaPeca('g', 1, new Cavaleiro(tabuleiro, Cor.BRANCO));
		colocarNovaPeca('h', 1, new Torre(tabuleiro, Cor.BRANCO));
		colocarNovaPeca('a', 2, new Penhor(tabuleiro, Cor.BRANCO));
		colocarNovaPeca('b', 2, new Penhor(tabuleiro, Cor.BRANCO, this));
		colocarNovaPeca('c', 2, new Penhor(tabuleiro, Cor.BRANCO, this));
		colocarNovaPeca('d', 2, new Penhor(tabuleiro, Cor.BRANCO, this));
		colocarNovaPeca('e', 2, new Penhor(tabuleiro, Cor.BRANCO, this));
		colocarNovaPeca('f', 2, new Penhor(tabuleiro, Cor.BRANCO, this));
		colocarNovaPeca('g', 2, new Penhor(tabuleiro, Cor.BRANCO, this));
		colocarNovaPeca('h', 2, new Penhor(tabuleiro, Cor.BRANCO, this));

		colocarNovaPeca('a', 8, new Torre(tabuleiro, Cor.PRETO));
        colocarNovaPeca('b', 8, new Cavaleiro(tabuleiro, Cor.PRETO));
        colocarNovaPeca('c', 8, new Bispo(tabuleiro, Cor.PRETO));
        colocarNovaPeca('d', 8, new Rainha(tabuleiro, Cor.PRETO));
        colocarNovaPeca('e', 8, new Rei(tabuleiro, Cor.PRETO));
        colocarNovaPeca('f', 8, new Bispo(tabuleiro, Cor.PRETO));
        colocarNovaPeca('g', 8, new Cavaleiro(tabuleiro, Cor.PRETO));
        colocarNovaPeca('h', 8, new Torre(tabuleiro, Cor.PRETO));
        colocarNovaPeca('a', 7, new Penhor(tabuleiro, Cor.PRETO, this));
        colocarNovaPeca('b', 7, new Penhor(tabuleiro, Cor.PRETO, this));
        colocarNovaPeca('c', 7, new Penhor(tabuleiro, Cor.PRETO, this));
        colocarNovaPeca('d', 7, new Penhor(tabuleiro, Cor.PRETO, this));
        colocarNovaPeca('e', 7, new Penhor(tabuleiro, Cor.PRETO, this));
        colocarNovaPeca('f', 7, new Penhor(tabuleiro, Cor.PRETO, this));
        colocarNovaPeca('g', 7, new Penhor(tabuleiro, Cor.PRETO, this));
        colocarNovaPeca('h', 7, new Penhor(tabuleiro, Cor.PRETO, this));
		
	}
	
}
