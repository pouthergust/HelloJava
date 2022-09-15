package main;

public class Caixa extends Produto {

	private double comprimento;
	private double altura;
	private double largura;
	
	public Caixa(double peso, double comprimento, double altura, double largura) {
		super(peso);
		this.comprimento = comprimento;
		this.altura = altura;
		this.largura = largura;
	}

	@Override
	public double calcularEspaco() {
		return 0.00;
	}
 }
