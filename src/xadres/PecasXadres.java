/**
 * @author Dulcidio Sobrinho
 * 25 de ago de 2020
 */
package xadres;

import borda.Peca;
import borda.Tabuleiro;

/**
 * @author dlsob
 *
 */
public class PecasXadres extends Peca{
	
	private Cores cor;

	/**
	 * @param tabuleiro
	 * @param cor
	 */
	public PecasXadres(Tabuleiro tabuleiro, Cores cor) {
		super(tabuleiro);
		this.cor = cor;
	}

	/**
	 * @return the cor
	 */
	public Cores getCor() {
		return cor;
	}
	
	

}
