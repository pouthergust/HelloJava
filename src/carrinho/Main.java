package carrinho;

public class Main {

	public static void main(String[] args) {
		Carrinho carrinho = Carrinho.getInstancia();
		
		carrinho.adicionarProduto("Cenourinhas");
		carrinho.cancelarCarrinho();
		carrinho.prevCarrinho();
		carrinho.nextCarrinho();
		carrinho.adicionarProduto("Cenourinhas");
		carrinho.nextCarrinho();
		carrinho.adicionarProduto("Cenourinhas");
		carrinho.nextCarrinho();
		carrinho.nextCarrinho();
	}

}
