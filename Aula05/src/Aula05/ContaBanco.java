package Aula05;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    //Metodos personalizados

    public void estadoAtual() {
        System.out.println("----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono:" + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (tipo == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com saldo!");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em debito");
        } else {
            setStatus(false);
            System.out.println("conta fechada com sucesso");
        }
    }

    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(getSaldo() + v);
            System.out.println("deposito realizado na conta de " + this.getDono());
        } else {
            System.out.println("a conta não esta aberta");
        }
    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("não a saldo suficiente");
            }
        } else {
            System.out.println("A conta não está aberta!");
        }
    }

    public void pagarMensal() {
        float v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
            System.out.println("Impossivel pagar conta fechada!");
        }
    }

    public void status() {
        System.out.println("" + saldo);
    }

    //Metodos Especiais
    /* public ContaBanco(float saldo, boolean status) { //construtor
        this.saldo = 0;
        this.status = false;
    } */
    
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
