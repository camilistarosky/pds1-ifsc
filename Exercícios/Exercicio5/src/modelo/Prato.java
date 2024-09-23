package modelo;

public class Prato {

	private float precoQuilo;
	private float Quilo;
	
	public float getPrecoQuilo() {
		return precoQuilo;
	}
	public void setPrecoQuilo(float precoQuilo) {
		this.precoQuilo = precoQuilo;
	}
	public float getQuilo() {
		return Quilo;
	}
	public void setQuilo(float quilo) {
		Quilo = quilo;
	}
	
	public float getPrecoPrato() {
		float resultado = this.precoQuilo * this.Quilo;
		return resultado;
	}
}
