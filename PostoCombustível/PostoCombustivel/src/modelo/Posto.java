package modelo;

public class Posto {

	private float precoDiesel;
	private float precoGasolinaComum;
	private float precoGasolinaAditivada;
	private float precoEtanol;

	private float quantidadeLitro;
	
	private float precoOleo500ml;
	private int quantidadeOleo500ml;

	private float precoOleo1L;
	private int quantidadeOleo1L;
	
	public float getPrecoDiesel() {
		return precoDiesel;
	}

	public void setPrecoDiesel(float precoDiesel) {
		this.precoDiesel = precoDiesel;
	}

	public float getPrecoGasolinaComum() {
		return precoGasolinaComum;
	}

	public void setPrecoGasolinaComum(float precoGasolinaComum) {
		this.precoGasolinaComum = precoGasolinaComum;
	}

	public float getPrecoGasolinaAditivada() {
		return precoGasolinaAditivada;
	}

	public void setPrecoGasolinaAditivada(float precoGasolinaAditivada) {
		this.precoGasolinaAditivada = precoGasolinaAditivada;
	}

	public float getPrecoEtanol() {
		return precoEtanol;
	}

	public void setPrecoEtanol(float precoEtanol) {
		this.precoEtanol = precoEtanol;
	}

	public float getQuantidadeLitro() {
		return quantidadeLitro;
	}

	public void setQuantidadeLitro(float quantidadeLitro) {
		this.quantidadeLitro = quantidadeLitro;
	}

	public float getPrecoOleo500ml() {
		return precoOleo500ml;
	}

	public void setPrecoOleo500ml(float precoOleo500ml) {
		this.precoOleo500ml = precoOleo500ml;
	}

	public int getQuantidadeOleo500ml() {
		return quantidadeOleo500ml;
	}

	public void setQuantidadeOleo500ml(int quantidadeOleo500ml) {
		this.quantidadeOleo500ml = quantidadeOleo500ml;
	}

	public float getPrecoOleo1L() {
		return precoOleo1L;
	}

	public void setPrecoOleo1L(float precoOleo1L) {
		this.precoOleo1L = precoOleo1L;
	}

	public int getQuantidadeOleo1L() {
		return quantidadeOleo1L;
	}

	public void setQuantidadeOleo1L(int quantidadeOleo1L) {
		this.quantidadeOleo1L = quantidadeOleo1L;
	}

	// Métodos para calcular o total de cada tipo de combustível
	public float getTotalDiesel() {
		return this.quantidadeLitro * this.precoDiesel;
	}

	public float getTotalGasolinaComum() {
		return this.quantidadeLitro * this.precoGasolinaComum;
	}

	public float getTotalGasolinaAditivada() {
		return this.quantidadeLitro * this.precoGasolinaAditivada;
	}

	public float getTotalEtanol() {
		return this.quantidadeLitro * this.precoEtanol;
	}

	// Método que calcula o total a pagar pelo óleo
	public float getTotalOleo() {
		float totalOleo500ml = this.quantidadeOleo500ml * this.precoOleo500ml;
		float totalOleo1L = this.quantidadeOleo1L * this.precoOleo1L;
		return totalOleo500ml + totalOleo1L;
	}
	
	public float getValorPagarOleo500() {
		float totalOleo500ml = this.quantidadeOleo500ml * this.precoOleo500ml;
		return totalOleo500ml;
	}
	
	public float getValorPagarOleo1() {
		float totalOleo1L = this.quantidadeOleo1L * this.precoOleo1L;
		return totalOleo1L;
	}

	// Método que calcula o total geral (combustível + óleo)
	public float getTotalGeral() {
		return getTotalDiesel() + getTotalGasolinaComum() + getTotalGasolinaAditivada() + getTotalEtanol()
				+ getTotalOleo();
	}

}
