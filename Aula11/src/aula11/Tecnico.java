package aula11;

public class Tecnico extends Aluno {

    private int registroProficional;

    public void praticar() {
        System.out.println("Estou praticando!");
    }

    public int getRegistroProficional() {
        return registroProficional;
    }

    public void setRegistroProficional(int registroProficional) {
        this.registroProficional = registroProficional;
    }
    
    

}
