package exercicio02;

public class Livro extends Materiais {

    private String editora;
    private int edicao;
    private String isbn;
    private String autor;

   

    
    
    
    public String mostrarGeral() {
        return "Livro{" + "editora=" + editora + ", edicao=" + edicao + ", isbn=" + isbn + ", autor=" + autor + '}';
    }
    
    

    public Livro(String editora, int edicao, String isbn, String autor) {
        this.editora = editora;
        this.edicao = edicao;
        this.isbn = isbn;
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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
    
    

}
