package aula10;

public class Funcionario extends Pessoa {

    //private Pessoa funcionario;
    private String setor;
    private boolean trabalhando;

    public void mudarTrabalho(String p) {
        setor = p;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

}
