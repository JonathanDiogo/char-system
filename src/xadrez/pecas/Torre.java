package xadrez.pecas;

import boardgame.Tabuleiro;
import xadrez.Cor;
import xadrez.XadrezPeca;

public class Torre extends XadrezPeca{

	public Torre(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);

	}


	


	@Override
	public String toString() {
		return "T";
	}
}
