/**
 * @author Dulcidio Sobrinho
 * 25 de ago de 2020
 */
package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

import xadres.Cores;
import xadres.PecasXadres;
import xadres.PosicaoXadres;

/**
 * @author dlsob
 *
 */
public class UI {
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

	public static void limparTela() {
			System.out.println("\033[H\033[2J");
			System.out.flush();
		
	}
	
	public static PosicaoXadres lerPosicaoXadres(Scanner sc) {
		try
		{
		String s = sc.nextLine();
		char coluna = s.charAt(0);
		int linha = Integer.parseInt(s.substring(1));
		return new PosicaoXadres(coluna, linha);
		}
		catch(RuntimeException e) {
			throw new InputMismatchException("Erro ao ler posicao do xadres Validos s�o de a1 at� h8");
		}
	}
	
	public static void printTabuleiro(PecasXadres[][] pecas) {
		for(int i = 0; i<pecas.length; i++) {
			System.out.print((8-i) + " ");
			for(int j = 0; j<pecas.length;j++) {
				printPiece(pecas[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	
	private static void printPiece(PecasXadres peca) {
    	if (peca == null) {
            System.out.print("-");
        }
        else {
            if (peca.getCor() == Cores.Brancas) {
                System.out.print(ANSI_WHITE + peca + ANSI_RESET);
            }
            else {
                System.out.print(ANSI_YELLOW + peca + ANSI_RESET);
            }
        }
        System.out.print(" ");
	}
	
	}

