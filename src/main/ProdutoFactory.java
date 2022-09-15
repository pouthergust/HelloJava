package main;

public class ProdutoFactory {
	public static Produto getProduto(String produto) {
		Produto instancia;
		Armazem armazem = Armazem.getInstancia();
		
		if (produto == null || produto.isEmpty())
			return null;
		
		switch (produto.toUpperCase()) {
		
			case "CAIXA10X10":
				instancia = new Caixa(1.00, 10.00, 10.00, 10.00);
				break;
				
			case "FUTEBOL":
				instancia = new Bola(5.00, 11.00);
				break;
				
			case "BOLATENIS":
				instancia = new Bola(.50, .32);
				break;
		
			default:
				throw new IllegalArgumentException("Produto invalido");
		}
		
		armazem.addProduto(instancia);
		return instancia;
	}
}
