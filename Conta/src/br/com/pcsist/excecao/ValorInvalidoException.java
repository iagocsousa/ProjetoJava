package br.com.pcsist.excecao;
public class ValorInvalidoException extends Exception {

		public ValorInvalidoException(Double valor) {
		super("Valor inv�lido " + valor  );	
	}	

}
