/**
 * @author Dulcidio Sobrinho
 * 26 de ago de 2020
 */
package xadres;

/**
 * @author dlsob
 *
 */
public class XadreExcessao extends RuntimeException{
 
	private static final long serialVersionUID = 1L;
	
	public XadreExcessao(String msg) {
		super(msg);
	}

}
