package br.com.pcsist.main;

import br.com.pcsist.excecao.ValorInvalidoException;
import br.com.pcsist.modelo.Conta;
import br.com.pcsist.modelo.ContaCorrente;

public class TestaComparacaoConta {

	public static void main(String[] args) throws ValorInvalidoException{
		Conta c1 = new ContaCorrente();
		Conta c2 = new ContaCorrente();
		c1.deposita(100);
		c1.numero = 123;
		c1.nome = "Iago";
		
		c2.deposita(100);
		c2.numero = 123;
		c2.nome	  = "Pedro";
		
		if (c1 == c2){
			System.out.println("contas iguais");
		}else{
			System.out.println("Conta diferentes");
		}
		
		if (c1.equals(c2)){
			System.out.println("contas iguais");
		}else{
			System.out.println("Conta diferentes");
		}
		
		String valor = "123";		
		
	}
}
