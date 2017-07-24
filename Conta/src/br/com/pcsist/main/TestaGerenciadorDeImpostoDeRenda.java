package br.com.pcsist.main;

import br.com.pcsist.excecao.ValorInvalidoException;
import br.com.pcsist.modelo.ContaCorrente;
import br.com.pcsist.modelo.GerenciadorDeImpostoDeRenda;
import br.com.pcsist.modelo.SeguroDeVida;

public class TestaGerenciadorDeImpostoDeRenda {
        public static void main(String[] args) {

            GerenciadorDeImpostoDeRenda gerenciador = 
                        new GerenciadorDeImpostoDeRenda();

            SeguroDeVida sv = new SeguroDeVida();
            gerenciador.adiciona(sv);

            ContaCorrente cc = new ContaCorrente();
            try {
				cc.deposita(1000);
			} catch (ValorInvalidoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            gerenciador.adiciona(cc);

            System.out.printf("O saldo é: %.2f",gerenciador.getTotal());
        }
}