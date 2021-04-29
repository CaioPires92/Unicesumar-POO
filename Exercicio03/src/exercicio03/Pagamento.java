package exercicio03;

public class Pagamento {

    private double valor;
    private String titulo;
    private String proprietario;

    public void inserir(double valor, String titulo, String proprietario) {
        this.valor = valor;
        this.proprietario = proprietario;
        this.titulo = titulo;

    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

}
