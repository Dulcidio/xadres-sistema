/**
 * @author Dulcidio Sobrinho
 * 23 de ago de 2020
 */
package borda;

/**
 * @author dlsob
 *
 */
public class Tabuleiro {
	
	private int linhas;
	private int colunas;
	private Peca [][] pecas;
	/**
	 * @param linhas
	 * @param colunas
	 */
	public Tabuleiro(int linhas, int colunas) {
		if(linhas < 1 || colunas < 1) {
			throw new TabuleiroExcessao("Erro ao criar tabuleiro: � necessario"
					+ "ter uma linha e uma coluna pelo menos");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}
	/**
	 * @return the linhas
	 */
	public int getLinhas() {
		return linhas;
	}
	 
	public int getColunas() {
		return colunas;
	}
	 
	
	public Peca peca(int linha, int coluna) {
		if(!posicaoExiste(linha, coluna)) {
			throw new TabuleiroExcessao("Posicao n�o existe no tabuleiro");
		}
		return pecas[linha][coluna];
	}
	
	public Peca peca(Posicao posicao) {
		if(!posicaoExiste(posicao)) {
			throw new TabuleiroExcessao("Posicao n�o existe no tabuleiro");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void localPeca(Peca peca, Posicao posicao) {
		if(temPeca(posicao)) {
			throw new TabuleiroExcessao("J� tem uma pe�a nesta posicao "+posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()]=peca;
		peca.posicao = posicao;
		
	}
	
	private boolean posicaoExiste(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
		
	}
	
	public boolean posicaoExiste(Posicao posicao) {
		return posicaoExiste(posicao.getLinha(), posicao.getColuna());
	}
	
	public boolean temPeca(Posicao posicao) {
		if(!posicaoExiste(posicao)) {
			throw new TabuleiroExcessao("Essa Posicao n�o existe no tabuleiro");
		}
		return peca(posicao)!= null;
	}

}
