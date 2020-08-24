/**
 * @author Dulcidio Sobrinho
 * 23 de ago de 2020
 */
package borda;

/**
 * @author dlsob
 *
 */
public class Posicao {
	
	private int linha;
	private int coluna;
	
	
	public Posicao() {
		
	}
	
	public Posicao(int linha, int coluna) {
		
		this.linha = linha;
		this.coluna = coluna;
	}
	/**
	 * @return the linha
	 */
	public int getLinha() {
		return linha;
	}
	/**
	 * @param linha the linha to set
	 */
	public void setLinha(int linha) {
		this.linha = linha;
	}
	/**
	 * @return the coluna
	 */
	public int getColuna() {
		return coluna;
	}
	/**
	 * @param coluna the coluna to set
	 */
	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	
	@Override
	public String toString() {
		return linha + " , " +coluna;
	}

}
