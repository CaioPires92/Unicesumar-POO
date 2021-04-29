package aula11;

public class Professor extends Pessoa {

    private String especialidade;
    private float salario;

    public void receberAlmento(int a) {
        salario += a;
        System.out.println("O salario do professo com almento é " + salario);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}
