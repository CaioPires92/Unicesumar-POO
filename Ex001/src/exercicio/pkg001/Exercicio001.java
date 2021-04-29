package exercicio.pkg001;

public class Exercicio001 {

    public static void main(String[] args) {
        
        Aula a1 = new Aula();
        a1.alunos = 10;
        a1.fim = 16;
        a1.inicio = 13;
        a1.professor = "José";
        a1.materia = "Historia";
        
        a1.comecarAula();
        
        a1.status();
    }

}
