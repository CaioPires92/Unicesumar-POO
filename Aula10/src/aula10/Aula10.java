package aula10;

public class Aula10 {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");

        p2.setCurso("Informatica");

        p3.setSalario(1500);
        p3.receberAlmento(550.20f);

        p4.setSetor("Estoque");

        p4.mudarTrabalho("Limpeza");

        System.out.println(p1.toString());
        System.out.println("---------------------------------------");

        System.out.println(p2.toString());
        System.out.println("---------------------------------------");

        System.out.println(p3.toString());
        System.out.println("---------------------------------------");

        System.out.println(p4.toString());
        System.out.println("---------------------------------------");

    }
}
