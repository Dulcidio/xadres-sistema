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
public class Rei  extends PecasXadres{

	/**
	 * @param tabuleiro
	 * @param cor
	 */
	public Rei (Tabuleiro tabuleiro, Cores cor) {
		super(tabuleiro, cor);
	}

	@Override
	public String toString() {
		return "R";
	}

}
