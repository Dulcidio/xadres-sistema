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
	/**
	 * @param linhas the linhas to set
	 */
	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}
	/**
	 * @return the colunas
	 */
	public int getColunas() {
		return colunas;
	}
	/**
	 * @param colunas the colunas to set
	 */
	public void setColunas(int colunas) {
		this.colunas = colunas;
	}
	
	public Peca peca(int linha, int coluna) {
		return pecas[linha][coluna];
	}
	
	public Peca peca(Posicao posicao) {
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}

}
