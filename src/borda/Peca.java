/**
 * @author Dulcidio Sobrinho
 * 23 de ago de 2020
 */
package borda;

/**
 * @author dlsob
 *
 */
public class Peca {
	
	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	/**
	 * @param tabuleiro
	 */
	public Peca(Tabuleiro tabuleiro) {
		
		this.tabuleiro = tabuleiro;
		
	}
	/**
	 * @return the posicao
	 */
    protected Posicao getPosicao() {
		return posicao;
	}
	
	
	

}
