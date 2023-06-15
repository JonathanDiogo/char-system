package xadrez;

import java.awt.Color;

import boardgame.Tabuleiro;

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
	
}
