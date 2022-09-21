package carrinho;

import java.util.ArrayList;

public class Vazio extends CarrinhoEstado {

	public Vazio() {
		cesta = new ArrayList<>();
	}

	@Override
	public void adicionarProduto(String produto) {
		instancia.adicionarProduto(produto);
	}

	@Override
	public void cancelarCarrinho() {
		System.out.println("Carrinho Cancelado!");
	}

	@Override
	public void prevCarrinho() {
		System.out.println("Carrinho anterior inexistente!");
	}

	@Override
	public void nextCarrinho() {
		instancia.setEstado(new Carregando());
		System.out.println("Carrinho carregando!");
	}

	
}
