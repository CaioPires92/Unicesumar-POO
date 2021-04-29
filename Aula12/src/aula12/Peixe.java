package aula12;

public class Peixe extends Animal {

    private String corEscama;

    public void soltarBolha() {
        System.out.println("blu blu blu");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("come minhoca");
    }

    @Override
    public void emitirSom() {
        System.out.println("Glub Glub");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    
}
