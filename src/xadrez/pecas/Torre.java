package xadrez.pecas;

import boardgame.Posicao;
import boardgame.Tabuleiro;
import xadrez.Cor;
import xadrez.XadrezPeca;

public class Torre extends XadrezPeca {

	public Torre(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);

	}

	@Override
	public String toString() {
		return "T";
	}

	@Override
	public boolean[][] possiveisMovimentos() {
		boolean[][] mat = new boolean[getTabuleiro().getLinhas()][getTabuleiro().getColunas()];
		Posicao p = new Posicao(0, 0);

		// verificar acima

		p.setValues(posicao.getLinha() - 1, posicao.getColuna());
		while (getTabuleiro().existePosicao(p) && !getTabuleiro().exitePeca(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
			p.setLinha(p.getLinha() - 1);
		}

		if (getTabuleiro().existePosicao(p) && existePecaAdviversaria(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		// verificar esquerda
		p.setValues(posicao.getLinha(), posicao.getColuna() - 1);
		while (getTabuleiro().existePosicao(p) && !getTabuleiro().exitePeca(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
			p.setColuna(p.getColuna() - 1);
		}

		if (getTabuleiro().existePosicao(p) && existePecaAdviversaria(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}
		

		// verificar direita
		p.setValues(posicao.getLinha(), posicao.getColuna() + 1);
		while (getTabuleiro().existePosicao(p) && !getTabuleiro().exitePeca(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
			p.setColuna(p.getColuna() + 1);
		}

		if (getTabuleiro().existePosicao(p) && existePecaAdviversaria(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}
		
		// verificar abaixo
		p.setValues(posicao.getLinha() + 1, posicao.getColuna());
		while  (getTabuleiro().existePosicao(p) && !getTabuleiro().exitePeca(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
			p.setColuna(p.getColuna() + 1);
		}
		if (getTabuleiro().existePosicao(p) && existePecaAdviversaria(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}
		
		return mat;
	}
	

}
