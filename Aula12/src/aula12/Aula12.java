package aula12;

public class Aula12 {

    public static void main(String[] args) {

        Mamifero m1 = new Mamifero();
        Reptil r1 = new Reptil();
        Peixe p1 = new Peixe();
        Ave a1 = new Ave();

        m1.setPeso(85.3f);
        m1.setIdade(2);
        m1.setMembros(4);
        m1.locomover();

        System.out.println("============================");

        p1.setPeso(0.35f);
        p1.setIdade(1);
        p1.setMembros(0);
        p1.locomover();
        p1.alimentar();
        p1.emitirSom();

        System.out.println("============================");

        a1.setPeso(0.89f);
        a1.setIdade(2);
        a1.setMembros(2);
        a1.locomover();
        a1.alimentar();
        a1.emitirSom();

        Canguru c1 = new Canguru();
        Cachorro ca1 = new Cachorro();
        Tartaruga t1 = new Tartaruga();
        Cobra co1 = new Cobra();
        Goldfish g1 = new Goldfish();
        Arara ar1 = new Arara();

    }

}
