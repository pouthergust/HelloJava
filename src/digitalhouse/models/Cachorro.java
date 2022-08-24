package src.digitalhouse.models;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }
    
    public String deveEmitirSom(String som) {
        if (som != null) {
            return som;
        }

        return "";
    }

    public String correr() {
        return "Estou correndinho";
    }
}
