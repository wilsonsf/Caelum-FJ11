package caelum.classes;

@SuppressWarnings("serial")
public class ValorInvalidoException extends RuntimeException {
	public ValorInvalidoException() {
		super ();
	}
	
	public ValorInvalidoException (String msg) {
		super (msg);
	}
}
