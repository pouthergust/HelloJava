package main;

public class Main {
	public static void main(String[] args) {
		Armazem armazem = Armazem.getInstancia();
		ProdutoFactory.getProduto("FUTEBOL");
		ProdutoFactory.getProduto("bolatenis");
		
		System.out.printf("%.2f", armazem.calcularEspacoNecessario());
	}
}
