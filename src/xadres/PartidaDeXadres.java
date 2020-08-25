/**
 * @author Dulcidio Sobrinho
 * 25 de ago de 2020
 */
package xadres;

import borda.Posicao;
import borda.Tabuleiro;
import xadres.pecas.Rei;
import xadres.pecas.Torre;

/**
 * @author dlsob
 *
 */
public class PartidaDeXadres {

	private Tabuleiro tabuleiro;
 
	public PartidaDeXadres( ) {
		 
		tabuleiro = new Tabuleiro(8, 8);
		setuInicial(); 
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
	
	private void setuInicial() {
		tabuleiro.localPeca(new Torre(tabuleiro,Cores.Brancas),new Posicao(2,1));
		tabuleiro.localPeca(new Rei(tabuleiro,Cores.Brancas),new Posicao(0,7));
		tabuleiro.localPeca(new Torre(tabuleiro,Cores.Pretas),new Posicao(7,7));
	}
	
}
