package exercicio02;

public class Materiais {

    protected String assunto;
    protected String titulo;

    public Materiais(String assunto, String titulo) {
        this.assunto = assunto;
        this.titulo = titulo;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    

    public void mostrarGeral() {
    }

}
