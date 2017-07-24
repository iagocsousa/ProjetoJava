package br.com.pcsist.main;

import br.com.pcsist.excecao.ValorInvalidoException;
import br.com.pcsist.modelo.Conta;
import br.com.pcsist.modelo.ContaCorrente;

class TestaDeposita {
	public static void main(String[] args) {
		try{
		Conta cp = new ContaCorrente();
		cp.deposita(-100);
		}catch(ValorInvalidoException e){
			System.out.println(e.getMessage());
		}
	}
}
