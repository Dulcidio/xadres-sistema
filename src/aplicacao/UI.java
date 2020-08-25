/**
 * @author Dulcidio Sobrinho
 * 25 de ago de 2020
 */
package aplicacao;

import xadres.PecasXadres;

/**
 * @author dlsob
 *
 */
public class UI {

	public static void printTabuleiro(PecasXadres[][] pecas) {
		for(int i = 0; i<pecas.length; i++) {
			System.out.print((8-i) + " ");
			for(int j = 0; j<pecas.length;j++) {
				printPeca(pecas[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	
	private static void printPeca(PecasXadres peca) {
		if(peca== null) {
			System.out.print("-");
		}
		else {
			System.out.print(peca);
		}
		System.out.print(" ");
	}
}
