package br.com.empresa.banco.conta;

@SuppressWarnings("serial")
public class ValorInvalidoException extends RuntimeException {
	public ValorInvalidoException() {
		super();
	}

	public ValorInvalidoException(double valor) {
		super("Valor invalido: " + valor);
	}

	public ValorInvalidoException(String msg) {
		super(msg);
	}
}
