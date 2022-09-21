package carrinho;

import java.util.ArrayList;
import java.util.List;

public abstract class CarrinhoEstado {
	protected CarrinhoEstado estado;
	protected static Carrinho instancia;
	protected List<String> cesta = new ArrayList<>();

	public CarrinhoEstado() {}
	
	public abstract void adicionarProduto(String produto);
	public abstract void cancelarCarrinho();
	public abstract void prevCarrinho();
	public abstract void nextCarrinho();
}
