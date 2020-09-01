/**
 * @author Dulcidio Sobrinho
 * 23 de ago de 2020
 */
package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

import xadres.PartidaDeXadres;
import xadres.PecasXadres;
import xadres.PosicaoXadres;
import xadres.XadreExcessao;

/**
 * @author dlsob
 *
 */
public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PartidaDeXadres partida  =  new PartidaDeXadres();
		
		while(true) {
			try {
				UI.limparTela();	
				UI.printTabuleiro(partida.getPecas());
				System.out.println(" ");
				System.out.println("Origem: ");
				PosicaoXadres origem = UI.lerPosicaoXadres(sc);
				
				System.out.println(" ");
				System.out.println("Destino: ");
				PosicaoXadres destino = UI.lerPosicaoXadres(sc);
				
				PecasXadres pecaCapturada = partida.realizarMovimentoPeca(origem, destino);
			}
			catch(XadreExcessao e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			catch(InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			
		
		
	
		
		}
	}

}
