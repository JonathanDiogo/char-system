package boardgame;

import javax.swing.text.Position;

public class Peca {

	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	
	
	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		this.posicao = null;
	}


	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

	
	
	
	
	
}
