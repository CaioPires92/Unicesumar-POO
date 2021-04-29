package exercicio02;

public class Exercicio02 {

    public static void main(String[] args) {

        Livro l = new Livro("Poder e conhecimento", 1111, "Nao sei", "Desconhecido");
        Revista r = new Revista("Roupas", "Abril");

        System.out.println(l.mostrarGeral());
        System.out.println(r.mostrarGeral());

    }

}
