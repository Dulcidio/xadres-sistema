/**
 * @author Dulcidio Sobrinho
 * 25 de ago de 2020
 */
package xadres;

import borda.Tabuleiro;

/**
 * @author dlsob
 *
 */
public class PartidaDeXadres {

	private Tabuleiro tabuleiro;
 
	public PartidaDeXadres( ) {
		 
		tabuleiro = new Tabuleiro(8, 8);
	}
	
	public PecasXadres[][] getPecas(){
		PecasXadres[][] mat = new PecasXadres[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for(int i = 0;i<tabuleiro.getLinhas();i++) {
			for(int j = 0; j<tabuleiro.getColunas();j++) {
				mat[i][j]=(PecasXadres)tabuleiro.peca(i,j);
			}
		}
		return mat;
	}
	
}
