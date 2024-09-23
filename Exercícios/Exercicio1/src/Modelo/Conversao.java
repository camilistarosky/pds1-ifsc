package Modelo;

public class Conversao {
	public float calcularTemperatura(float tempF) {
		float tempC;
		
		tempC = (tempF - 32) * 5f/9f;
		
		return tempC;
	}
}
