package carrinho;

public class Fechado extends CarrinhoEstado {
	

	public Fechado() {}

	@Override
	public void adicionarProduto(String produto) {
		instancia.adicionarProduto(produto);
	}

	@Override
	public void cancelarCarrinho() {
		instancia.setEstado(new Vazio());
	}

	@Override
	public void prevCarrinho() {
		instancia.setEstado(new Carregando());
	}

	@Override
	public void nextCarrinho() {
		System.out.println("Carrinho posterior Inexistente!");
		System.out.printf("Cesta: %s", cesta.toString());
	}
	
	
}
