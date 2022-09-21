package carrinho;

import java.util.*;

public class Carrinho extends CarrinhoEstado {
	
	public Carrinho() {
		estado = new Vazio();
	}
	
	public static Carrinho getInstancia() {
		if (instancia == null) {
			instancia = new Carrinho();
			return instancia;
		}
		
		return instancia;
	}

	public CarrinhoEstado getEstado() {
		return estado;
	}

	public void setEstado(CarrinhoEstado estado) {
		this.estado = estado;
		System.out.println("Alterando estado...");
	}

	@Override
	public void adicionarProduto(String produto) {
		cesta.add(produto);
		System.out.println("Produto adicionado!");
	}

	@Override
	public void cancelarCarrinho() {
		this.setEstado(new Vazio());
	}

	@Override
	public void prevCarrinho() {
		this.setEstado(new Vazio());
		estado.prevCarrinho();
	}

	@Override
	public void nextCarrinho() {
		estado.nextCarrinho();
	}

}
