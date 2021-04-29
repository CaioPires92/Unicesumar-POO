package aula09;

public class Aula09 {

    public static void main(String[] args) {

        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("João", 22, "M");
        p[1] = new Pessoa("Joana", 44, "F");

        l[0] = new Livro("Joao e o Pé de Feijão", "Joseph Jacobs", 100, p[0]);
        l[1] = new Livro("João e Maria", "Irmãos Grimm", 100, p[1]);
        l[2] = new Livro("Cinderela", "Irmãos Grimm", 150, p[0]);

        l[0].abrir();
        l[0].folhear(400);
        System.out.println(l[0].detalhes());
        System.out.println("=====================================");
        System.out.println(l[1].detalhes());       
    }

}
