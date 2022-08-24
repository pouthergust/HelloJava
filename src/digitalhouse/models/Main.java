package src.digitalhouse.models;

import java.text.MessageFormat;

public class Main {

    public static void main(String[] args) {
        
        Cachorro dogaum = new Cachorro("Snoopy", 9);
        Cavalo pocoto = new Cavalo("Pé de Pano", 12);
        Preguica bicho = new Preguica("Sid", 22);

        Animal[] animais = {dogaum, pocoto, bicho};

        for (Animal animal : animais) {
            System.out.println(oQueFazer(animal));
        }
    }

    public static String oQueFazer(Animal animal) {
        String acao;

        if (animal instanceof Preguica) {
            acao = ((Preguica)animal).deveSubirEmArvores();
        } else {
            acao = animal.correr();
        }

        return MessageFormat.format("o {0} disse {1}", animal.nome, acao);
    }


}