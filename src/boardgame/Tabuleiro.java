package boardgame;

public class Tabuleiro {

	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	
	
	public Tabuleiro(int linhas, int colunas) {
		if(linhas < 1 || linhas < 1) {
			throw new TabuleiroExcecao("É necessário que haja pelo menos uma linha e uma coluna;");
		}
		this.linhas = linhas;
		this.colunas = colunas;		
		pecas = new Peca[linhas][colunas];
	}


	public int getLinhas() {
		return linhas;
	}
	
	public int getColunas() {
		return colunas;
	}

	public Peca peca(int linhas, int colunas) {
		if(!existePosicao(linhas, colunas)) {
			throw new TabuleiroExcecao("Esta posição não existe no tabuleiro" );
		}
		return pecas[linhas][colunas];
	}
	
	public Peca peca(Posicao posicao) {
		if(!existePosicao(posicao)) {
			throw new TabuleiroExcecao("Esta posição não existe no tabuleiro");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void lugarPeca(Peca peca, Posicao posicao) {
		if(exitePeca(posicao)) {
			throw new TabuleiroExcecao("Já existe uma peça na posição " + posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao; 
 	}
	
	private boolean existePosicao(int linha, int coluna) {

		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
		
	}
	
	public boolean existePosicao(Posicao posicao) {
		return existePosicao(posicao.getLinha(), posicao.getColuna());
	}
	
	public boolean exitePeca(Posicao posicao) {
		if(!existePosicao(posicao)) {
			throw new TabuleiroExcecao("Esta posição não existe no tabuleiro");
		}
		return peca(posicao) != null;
		
	}
	
	public Peca removerPeca(Posicao posicao) {
		if(!existePosicao(posicao)) {
			throw new TabuleiroExcecao("Está posição não existe");
		}
		if(peca(posicao) == null) {
			return null;
		}
		Peca aux = peca(posicao);
		aux.posicao = null;
		pecas[posicao.getLinha()][posicao.getColuna()] = null;
		return aux;
	}
}
