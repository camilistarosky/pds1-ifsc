package modelo;

public class Investimento {
	private int meses;
	private double juros;
	private double deposito_mensal;

	public Investimento(int a, double j, double dm) {
		meses = a;
		juros = j / 100;
		deposito_mensal = dm;
	}

	public double calculaTotal() {
		int num_pagamentos = meses;
		double total = 0;
		for (int i = 0; i < num_pagamentos; i++) {
			total = total + deposito_mensal;
			total = total + total * juros;
		}
		return total;
	}

	public int getMeses() {
		return meses;
	}

	public void setMeses(int meses) {
		this.meses = meses;
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}

	public double getDeposito_mensal() {
		return deposito_mensal;
	}

	public void setDeposito_mensal(double deposito_mensal) {
		this.deposito_mensal = deposito_mensal;
	}
	
	
}
