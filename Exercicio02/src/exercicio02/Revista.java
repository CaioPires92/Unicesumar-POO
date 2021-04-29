package exercicio02;

public class Revista extends Materiais {

    private String colecao;
    private String editora;

    @Override
    public String mostrarGeral() {
        super.mostrarGeral();
        return "Revista{" + "colecao=" + colecao + ", editora=" + editora + '}';
    }

    public Revista(String colecao, String editora) {
        this.colecao = colecao;
        this.editora = editora;
    }

    public String getColecao() {
        return colecao;
    }

    public void setColecao(String colecao) {
        this.colecao = colecao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

}
