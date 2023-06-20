package xadrez;

import java.awt.Color;

import boardgame.Peca;
import boardgame.Posicao;
import boardgame.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaXadrez {

	private Tabuleiro tabuleiro;

	
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		iniciarPartida();
	}

	public XadrezPeca[][] getPecas() {
		XadrezPeca[][] matriz = new XadrezPeca[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int i = 0; i < tabuleiro.getLinhas(); i++) {
			for (int j = 0; j < tabuleiro.getColunas(); j++) {
				matriz[i][j] = (XadrezPeca) tabuleiro.peca(i, j);
			}
		}
		return matriz;

	}

	private void colocarNovaPeca(char coluna, int linha, XadrezPeca peca) {
		tabuleiro.lugarPeca(peca, new XadrezPosicao(coluna, linha).paraPosicao());
		;
	}

	public XadrezPeca executarMovimentoPeca(XadrezPosicao posicaoOrigem, XadrezPosicao posicaoDestino) {
		Posicao origem = posicaoOrigem.paraPosicao();
		Posicao destino = posicaoDestino.paraPosicao();
		validarPosicaoOrigem(origem);
		validarPosicaoDestino(origem, destino);
		Peca pecaCapturada = moverPeca(origem, destino);
		return (XadrezPeca) pecaCapturada;
	}
	
	private void validarPosicaoOrigem(Posicao posicao) {
		if(!tabuleiro.exitePeca(posicao)) {
			throw new XadrezExcecao("Não existe peça nesta posição");
		} 
		if(!tabuleiro.peca(posicao).existePossivelMovimento()) {
			throw new XadrezExcecao("Não existem movimentos possíveis para a peça escolhida!");	
		}
	}
	
	private void validarPosicaoDestino(Posicao origem, Posicao destino) {
		if(!tabuleiro.peca(origem).possivelMovimento(destino)) {
			throw new XadrezExcecao("A peça escolhida não pode se mover para a posição de destino");
		}
	}
	
	private Peca moverPeca(Posicao origem, Posicao destino){
		Peca p = tabuleiro.removerPeca(origem);
		Peca pecaCapturada = tabuleiro.removerPeca(destino);
		tabuleiro.lugarPeca(p, destino);
		return pecaCapturada;
	}

	private void iniciarPartida() {

		colocarNovaPeca('a', 1, new Torre(tabuleiro, Cor.BRANCO));
		colocarNovaPeca('b', 1, new Torre(tabuleiro, Cor.BRANCO));
		colocarNovaPeca('c', 1, new Torre(tabuleiro, Cor.BRANCO));
		colocarNovaPeca('d', 1, new Torre(tabuleiro, Cor.BRANCO));
		colocarNovaPeca('f', 1, new Rei(tabuleiro, Cor.BRANCO));
		colocarNovaPeca('g', 1, new Rei(tabuleiro, Cor.BRANCO));
		
		colocarNovaPeca('a', 8, new Torre(tabuleiro, Cor.PRETO));
		colocarNovaPeca('b', 8, new Torre(tabuleiro, Cor.PRETO));
		colocarNovaPeca('c', 8, new Torre(tabuleiro, Cor.PRETO));
		colocarNovaPeca('d', 8, new Torre(tabuleiro, Cor.PRETO));
		colocarNovaPeca('e', 8, new Rei(tabuleiro, Cor.PRETO));
		colocarNovaPeca('f', 8, new Torre(tabuleiro, Cor.PRETO));
		colocarNovaPeca('g', 8, new Rei(tabuleiro, Cor.PRETO));
		colocarNovaPeca('h', 8, new Torre(tabuleiro, Cor.PRETO));
		


	}

}
