package src.digitalhouse.models;

public abstract class Animal {
    
    protected String nome;
    protected int idade;

    protected Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract String deveEmitirSom(String som);
    public String correr() {
        return "Vey, implementa o bglh certo";
    }
}
