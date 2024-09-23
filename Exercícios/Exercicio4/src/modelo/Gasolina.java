package modelo;

public class Gasolina {
	
	private float precoLitro;
	private float totalPagar;

	public float getPrecoLitro() {
		return precoLitro;
	}



	public void setPrecoLitro(float precoLitro) {
		this.precoLitro = precoLitro;
	}



	public float getTotalPagar() {
		return totalPagar;
	}



	public void setTotalPagar(float totalPagar) {
		this.totalPagar = totalPagar;
	}


	public float getTotalLitros () {
		float resultado = this.totalPagar / this.precoLitro;
		return resultado;
	}
}
