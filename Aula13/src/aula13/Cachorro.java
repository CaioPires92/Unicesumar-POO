package aula13;

public class Cachorro extends Lobo {

    public void reagir(String frase) {
        if (("Toma comida".equals(frase)) || ("Ola".equals(frase))) {
            System.out.println("abanando o rabo!");
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int min, int hora) {
        if (hora < 12) {
            System.out.println("Abanar");
        } else if (hora >= 18) {
            System.out.println("ignorar");
        } else {
            System.out.println("Abanar e latir");
        }
    }

    public void reagir(boolean dono) {
        if (dono == true) {
            System.out.println("abanar");
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int idade, float peso) {
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else if (peso < 10) {
            System.out.println("Rosnar");
        } else {
            System.out.println("Ignorar");
        }
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au Au");
    }
}
