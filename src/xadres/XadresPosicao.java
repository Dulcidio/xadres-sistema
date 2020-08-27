/**
 * @author Dulcidio Sobrinho
 * 26 de ago de 2020
 */
package xadres;

import borda.Posicao;

/**
 * @author dlsob
 *
 */
public class XadresPosicao {

	private char coluna;
	private int linha;
	
	public XadresPosicao(char coluna, int linha) {
		 if(coluna<'a' || coluna > 'h' || linha < 1 || linha >8) {
			 throw new XadresExcessao("Erro ao instanciar Posicao Xadres, Posicao invalida");
		 }
		this.coluna = coluna;
		this.linha = linha;
	}

	/**
	 * @return the coluna
	 */
	public char getColuna() {
		return coluna;
	}

	/**
	 * @return the linha
	 */
	public int getLinha() {
		return linha;
	}
	
	protected Posicao toPosicao() {
		return new Posicao(8 - linha, coluna - 'a');
	}
	
	protected static XadresPosicao fromPosicao(Posicao posicao) {
		return new XadresPosicao((char)('a' - posicao.getColuna()),8-posicao.getLinha());
	}
	
	@Override
	public String toString() {
		return ""+coluna + linha;
	}
}
