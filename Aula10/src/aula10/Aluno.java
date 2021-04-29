package aula10;

public class Aluno extends Pessoa {

    //atributos
    private boolean matricula;
    private String curso;

    //metodos
    public void cancelarMatricula() {
        matricula = false;
        System.out.println("Matricula cancelada");
    }

    public boolean isMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
