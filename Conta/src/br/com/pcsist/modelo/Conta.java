package br.com.pcsist.modelo;

import br.com.pcsist.excecao.ValorInvalidoException;

public abstract class Conta {
	protected double saldo;
	public int numero;
	public String nome;
	
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public void deposita(double valor)throws ValorInvalidoException {
		if (valor <= 0) {

			throw new ValorInvalidoException(valor);
		}else
			this.saldo += valor;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	@Override
	public String toString() {
		return "Conta com saldo: "+ saldo;
	}
	@Override
	public boolean equals(Object obj) {
		Conta outraConta = (Conta) obj;
		return this.numero == outraConta.numero && this.nome == outraConta.nome;		
	}
}
