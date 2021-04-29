package exercicio.pkg001;

public class Aula {

    int inicio;
    int fim;
    int alunos;
    String professor;
    String materia;

    void status() {

        System.out.println("A aula se inicia as " + this.inicio + ":00"
                + " e termina as " + this.fim + ":00");
        System.out.println("A sala tem " + this.alunos + " alunos");
        System.out.println("O nome do professor é " + this.professor);
        System.out.println("A materia cursada é " + this.materia);
    }

    void comecarAula() {
        if (inicio < 12) {
            System.out.println("a aula pode começar");
        } else {
            System.out.println("ainda não e hora");
        }
    }

}
