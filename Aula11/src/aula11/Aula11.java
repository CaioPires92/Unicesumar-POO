package aula11;

public class Aula11 {
    
    public static void main(String[] args) {
        /*
        Visitante v1 = new Visitante();
        Bolsista b1 = new Bolsista();
        Tecnico t1 = new Tecnico();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString()); */
        
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(1111);
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        
        Tecnico t1 = new Tecnico();
        t1.praticar();
        
        Professor p1 = new Professor();
        p1.setSalario(100f);
        p1.receberAlmento(100);
    }
    
}
