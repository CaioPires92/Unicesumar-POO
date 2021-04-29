package ex002;

public class Copo {

    boolean cheio;
    String cor;
    String liquido;

    void encher() {
        if (cheio == true) {
            System.out.println("se colocar mais " + this.liquido
                    + " vai transbordar");
        } else {
            System.out.println("colocando mais " + this.liquido);
        }
    }

    void status() {
        System.out.println("A cor do copo é " + cor);
        System.out.println("está com " + liquido + " dentro dele");
    }
}
