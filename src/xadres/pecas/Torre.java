/**
 * @author Dulcidio Sobrinho
 * 25 de ago de 2020
 */
package xadres.pecas;

import borda.Tabuleiro;
import xadres.Cores;
import xadres.PecasXadres;

/**
 * @author dlsob
 *
 */
public class Torre extends PecasXadres{

	/**
	 * @param tabuleiro
	 * @param cor
	 */
	public Torre(Tabuleiro tabuleiro, Cores cor) {
		super(tabuleiro, cor);
	}

	@Override
	public String toString() {
		return "T";
	}
}
