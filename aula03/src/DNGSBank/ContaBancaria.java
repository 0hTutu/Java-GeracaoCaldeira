package DNGSBank;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ContaBancaria {
    private String nome;
    private String cpf;
    private int idconta;
    private String banco;
    private String endereco;
    private double saldo;
    private Date horarioAtual;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdconta() {
        return idconta;
    }

    public void setIdconta(int idconta) {
        this.idconta = idconta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void verificarHorario() {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        atualizaHorario();
        System.out.printf("Horario atual: %s\n", formatter.format(this.horarioAtual));
    }

    private void atualizaHorario() {
        this.horarioAtual = new Date();
    }

    public void saque(double valor){
        if(valor > this.saldo){
            System.out.println("Impossivel realizar este saque devido a saldo insuficiente.");
        }else if(valor < this.saldo){
            this.saldo -= valor;
        }
    }

    public void deposita(double valor){
        if(valor == 0){
            System.out.println("Por favor insira um número superior á 0");
        } else {
            this.saldo += valor;
        }
    }

    public void pix(double valor){
        atualizaHorario();
        if (this.horarioAtual.getHours() < 8 || this.horarioAtual.getHours() > 19) {
            System.out.println("Fora do horário! Transferências só podem ocorrer das 8h às 19h!");
            verificarHorario();
            return;
        }
        if(valor > this.saldo){
            System.out.println("Impossivel realizar esta transferencia PIX devido a saldo insuficiente.");
        }
        if(valor < this.saldo){
            this.saldo -= valor;
            System.out.println("Você transferiu " + valor + "R$ em " + this.horarioAtual);
        }

    }

    public void verificarSaldo(){
        System.out.println(getSaldo());
    }

    public void verificarInfos(){
        System.out.println(" Aqui são suas informações pessoais ");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Banco: " + getBanco());
    }
}
