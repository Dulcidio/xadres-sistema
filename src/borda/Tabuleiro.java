/**
 * @author Dulcidio Sobrinho
 * 23 de ago de 2020
 */
package borda;

/**
 * @author dlsob
 *
 */
public class Tabuleiro {
	
	private int linhas;
	private int colunas;
	private Peca [][] pecas;
	/**
	 * @param linhas
	 * @param colunas
	 */
	public Tabuleiro(int linhas, int colunas) {
		if(linhas < 1 || colunas < 1) {
			throw new TabuleiroExcessao("Erro ao criar tabuleiro: É necessario"
					+ "ter uma linha e uma coluna pelo menos");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}
	/**
	 * @return the linhas
	 */
	public int getLinhas() {
		return linhas;
	}
	 
	public int getColunas() {
		return colunas;
	}
	 
	
	public Peca peca(int linha, int coluna) {
		if(!posicaoExiste(linha, coluna)) {
			throw new TabuleiroExcessao("Posicao não existe no tabuleiro");
		}
		return pecas[linha][coluna];
	}
	
	public Peca peca(Posicao posicao) {
		if(!posicaoExiste(posicao)) {
			throw new TabuleiroExcessao("Posicao não existe no tabuleiro");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void localPeca(Peca peca, Posicao posicao) {
		if(temPeca(posicao)) {
			throw new TabuleiroExcessao("Já tem uma peça nesta posicao "+posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()]=peca;
		peca.posicao = posicao;
		
	}
	
	private boolean posicaoExiste(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
		
	}
	
	public boolean posicaoExiste(Posicao posicao) {
		return posicaoExiste(posicao.getLinha(), posicao.getColuna());
	}
	
	public boolean temPeca(Posicao posicao) {
		if(!posicaoExiste(posicao)) {
			throw new TabuleiroExcessao("Essa Posicao não existe no tabuleiro");
		}
		return peca(posicao)!= null;
	}
	
	public Peca removerPeca(Posicao posicao) {
		if(!posicaoExiste(posicao)) {
			throw new TabuleiroExcessao("Não existe essa posicao no tabuleiro");
		}
		if(peca(posicao)==null) {
			return null;
		}
		Peca aux = peca(posicao);
		aux.posicao = null;
		pecas[posicao.getLinha()][posicao.getColuna()] = null;
		return aux;
		
		
	}

}
