package src.digitalhouse.models;

public class Preguica extends Animal {
        
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    public String deveEmitirSom(String som) {
        if (som != null) {
            return som;
        }

        return "";
    }

    public String deveSubirEmArvores() {
        return "Estou Subindinho";
    }
}
