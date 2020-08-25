/**
 * @author Dulcidio Sobrinho
 * 23 de ago de 2020
 */
package aplicacao;

import xadres.PartidaDeXadres;

/**
 * @author dlsob
 *
 */
public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		PartidaDeXadres partida  =  new PartidaDeXadres();
		UI.printTabuleiro(partida.getPecas());
	}

}
