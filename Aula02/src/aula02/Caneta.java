package aula02;

public class Caneta {

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status() {
        System.out.println("Modelo" + this.modelo);
        System.out.println("Caneta " + this.cor);
        System.out.println("com a carga em " + this.carga + "%");
        System.out.println("está tampada? " + this.tampada);
    }

    private void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Impossivel Rabiscar,"
                    + "destampe a caneta primeiro");
        } else {
            System.out.println("Rabiscando um circulo!");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

}
