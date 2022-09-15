package main;

import java.util.*;

public class Armazem {
	
	List<Produto> listaDeProdutos = new ArrayList<>(); 

	private static Armazem instancia;
	
	private Armazem() { }

	public static Armazem getInstancia() {
		if (instancia == null) {
			return new Armazem();
		}
		
		return instancia;
	}

	public double calcularEspacoNecessario() {
		double espacoNecessario = 0.00;
		
		for (Produto produto: this.listaDeProdutos) {
			espacoNecessario += produto.calcularEspaco();
		}
		
		return espacoNecessario;
	}
	
	public void addProduto(Produto produto) {
		this.listaDeProdutos.add(produto);
	}
}
