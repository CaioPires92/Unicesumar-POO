package aula12;

public class Canguru extends Mamifero {

    public boolean usarBolsa(boolean a) {
        return a;
    }
    
    @Override
    public void locomover() {
        System.out.println("Saltando");
    }
}
