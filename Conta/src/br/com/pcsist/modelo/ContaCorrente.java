package br.com.pcsist.modelo;
public class ContaCorrente extends Conta implements Tributavel {

	
	public void atualiza(double taxa) {
		super.atualiza(taxa*2);
	}

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.1;
	}
	

}
