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
	
	private void iniciarPartida() {
		
		tabuleiro.lugarPeca(new Torre(tabuleiro, Cor.BRANCO), new Posicao(1, 1));
		tabuleiro.lugarPeca(new Torre(tabuleiro, Cor.PRETO), new Posicao(6, 5));
		
	}
	
}
