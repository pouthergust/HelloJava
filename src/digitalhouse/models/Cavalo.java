package src.digitalhouse.models;

public class Cavalo extends Animal {

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }
    
    public String deveEmitirSom(String som) {
        if (som != null) {
            return som;
        }

        return "";
    }

    public String correr() {
        return "Estou galopandinho";
    }
}
