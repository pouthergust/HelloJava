package carrinho;

import java.util.ArrayList;
import java.util.List;

public class Carregando extends CarrinhoEstado {
	
	public Carregando() {}

	@Override
	public void adicionarProduto(String produto) {
		instancia.adicionarProduto(produto);
	}

	@Override
	public void cancelarCarrinho() {
		instancia.cancelarCarrinho();
	}

	@Override
	public void prevCarrinho() {
		instancia.setEstado(new Vazio());
		System.out.println("Carrinho Vazio!");
	}

	@Override
	public void nextCarrinho() {
		instancia.setEstado(new Fechado());
		System.out.println("Carrinho Fechando!");
	}
	
	
}
