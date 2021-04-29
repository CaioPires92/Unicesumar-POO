package exercicio03;

public class Ouvidoria {

    private String nome;
    private String email;
    private String assunto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public Ouvidoria(String nome, String email, String assunto) {
        this.nome = nome;
        this.email = email;
        this.assunto = assunto;
    }

    @Override
    public String toString() {
        return "Ouvidoria{" + "nome=" + nome + ", email=" + email + ", assunto=" + assunto + '}';
    }
    
     
}
