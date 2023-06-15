package boardgame;

public class Tabuleiro {

	private int linhas;
	private int colunas;
	private Peca[][] peca;
	
	
	public Tabuleiro(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;		
		peca = new Peca[linhas][colunas];
	}
	
	
}
