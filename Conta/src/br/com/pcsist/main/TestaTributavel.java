package br.com.pcsist.main;

import br.com.pcsist.excecao.ValorInvalidoException;
import br.com.pcsist.modelo.ContaCorrente;
import br.com.pcsist.modelo.Tributavel;

class TestaTributavel {

        public static void main(String[] args) {
            ContaCorrente cc = new ContaCorrente();
            try {
				cc.deposita(100);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            System.out.println(cc.calculaTributos());

            // testando polimorfismo:
            Tributavel t = cc;
            System.out.println(t.calculaTributos());
            
        }
    }