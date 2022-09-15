package main;

public class Bola extends Produto {

	private double raio;
	
	public Bola(double peso, double raio) {
		super(peso);
		this.raio = raio;
	}

	@Override
	public double calcularEspaco() {
		System.out.println(Math.pow(2, Math.PI) * raio);
		System.out.println("Aoba");
		return Math.pow(2, Math.PI) * raio;
	}
}
