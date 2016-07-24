package dominio;

public class Paciente {
	private double peso;
	private double altura;
	
	public Paciente(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public double getAltura() {
		return this.altura;
	}
}
