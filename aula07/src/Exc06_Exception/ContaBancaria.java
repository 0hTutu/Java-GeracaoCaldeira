package Exc06_Exception;

public class ContaBancaria {

    private double saldo = 0;
    private String nome = "Dudu Fetterman";

    public void saque(double valor) throws SaldoInsuficienteException {
        if(this.saldo < valor){
           throw new SaldoInsuficienteException("Impossivel realizar o saque devido a saldo insuficiente!");
        } else if(valor < this.saldo){
            this.saldo -= valor;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
