/**
 * @author Dulcidio Sobrinho
 * 25 de ago de 2020
 */
package xadres;

import borda.Peca;
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
	
	public PecasXadres realizarMovimentoPeca(PosicaoXadres origem2, PosicaoXadres destino2) {
		Posicao origem =  origem2.toPosicao();
		Posicao destino = destino2.toPosicao();
		validarPosicaoOrigem(origem);
		Peca pecaCapturada = facaMovimento(origem, destino);
		return (PecasXadres)pecaCapturada;
		
	}
	
	private Peca facaMovimento(Posicao origem, Posicao destino) {
		Peca p =tabuleiro.removerPeca(origem);
		Peca pecaCapturada = tabuleiro.removerPeca(destino);
		tabuleiro.localPeca(p, destino);
		return pecaCapturada;
	}
	
	private void validarPosicaoOrigem(Posicao posicao) {
		if(!tabuleiro.temPeca(posicao)) {
			throw new XadreExcessao("Não existe peca na posicao de origem");
		}
		
	}
	
	public void localPecaNova(char coluna, int linha, PecasXadres peca) {
		tabuleiro.localPeca(peca, new PosicaoXadres(coluna, linha).toPosicao());
	}
	
	/*private void localNovaPeca(char coluna, int linha, PecasXadres peca) {
		tabuleiro.localPeca(peca, new PosicaoXadres(coluna, linha).toPosicao());
	}*/
	
	private void setuInicial() {
		
		localPecaNova('c', 1, new Torre(tabuleiro,Cores.Brancas));
		localPecaNova('c', 2, new Torre(tabuleiro,Cores.Brancas));
		localPecaNova('d', 2, new Torre(tabuleiro,Cores.Brancas));
		localPecaNova('e', 2, new Torre(tabuleiro,Cores.Brancas));
		localPecaNova('e', 1, new Torre(tabuleiro,Cores.Brancas));
		localPecaNova('d', 1, new Rei(tabuleiro,Cores.Brancas));

		localPecaNova('c', 7, new Torre(tabuleiro,Cores.Pretas));
		localPecaNova('c', 8, new Torre(tabuleiro,Cores.Pretas));
		localPecaNova('d', 7, new Torre(tabuleiro,Cores.Pretas));
		localPecaNova('e', 7, new Torre(tabuleiro,Cores.Pretas));
		localPecaNova('e', 8, new Torre(tabuleiro,Cores.Pretas));
		localPecaNova('d', 8, new Rei(tabuleiro,Cores.Pretas));
	}
	
}
