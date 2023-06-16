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

		colocarNovaPeca('e', 6, new Torre(tabuleiro, Cor.PRETO));
		colocarNovaPeca('b', 3, new Torre(tabuleiro, Cor.BRANCO));
		
	}
	
}
