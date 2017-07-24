package br.com.pcsist.main;

import java.io.PrintStream;

import br.com.pcsist.excecao.ValorInvalidoException;
import br.com.pcsist.modelo.Conta;
import br.com.pcsist.modelo.ContaCorrente;

public class TestaInteger {
	public static void main(String[] args){
		Integer x1 = new Integer(10);
	    Integer x2 = new Integer(10);
	    
		    
	    if (x1 == x2) {
	        System.out.println("igual");
	    } else {
	        System.out.println("diferente");
	    }
	    
	    if (x1.equals(x2)){
	        System.out.println("igual");
	    } else {
	        System.out.println("diferente");
	    }		
		
	    System.out.println(x1.toString());
	    x1 = Integer.parseInt("31");	    
	    System.out.println(x1.toString());
	    
	    
	    PrintStream saida = System.out;
	    saida.println("ola");
	    
	    Conta conta = new ContaCorrente();
	    
	    try {
			conta.deposita(100);
		} catch (ValorInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    System.out.println(conta);
	    
	}
}
