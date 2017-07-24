package br.com.pcsist.excecao;
public class ValorInvalidoException extends Exception {

		public ValorInvalidoException(Double valor) {
		super("Valor inválido " + valor  );	
	}	

}
