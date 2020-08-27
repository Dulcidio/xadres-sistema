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
public class PosicaoXadres {

	private char coluna;
	private int linhas;
	/**
	 * @param coluna
	 * @param linhas
	 */
	public PosicaoXadres(char coluna, int linha) {
		 if(coluna < 'a' || coluna  > 'h' || linha < 1 || linha > 8) {
			 throw new XadreExcessao("Erro ao instanciar posicao xadres: valores validar de a1 até h8");
		 }
		this.coluna = coluna;
		this.linhas = linha;
	}
	/**
	 * @return the coluna
	 */
	public char getColuna() {
		return coluna;
	}
	/**
	 * @return the linhas
	 */
	public int getLinhas() {
		return linhas;
	}
	
	protected Posicao toPosicao() {
		return new Posicao(8 - linhas, coluna - 'a');
	}
	
	protected static PosicaoXadres fromPosition(Posicao posicao) {
		return new PosicaoXadres((char)('a'-posicao.getColuna()), 8 - posicao.getLinha());
	}
	
	@Override
	public String toString() {
		return "" + coluna + linhas;
	}
}
