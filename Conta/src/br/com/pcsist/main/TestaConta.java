package br.com.pcsist.main;

import br.com.pcsist.excecao.ValorInvalidoException;
import br.com.pcsist.modelo.Conta;
import br.com.pcsist.modelo.ContaCorrente;

public class TestaConta {

	public static void main(String[] args) throws ValorInvalidoException {
		Conta conta = new ContaCorrente();
		conta.deposita(100);
		System.out.println(conta.getSaldo());

	}

}
