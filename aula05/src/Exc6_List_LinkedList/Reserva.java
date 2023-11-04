package src.Exc6_List_LinkedList;

import java.text.SimpleDateFormat;

public class Reserva {

    String nome;
    String local;
    String cpf; //<- usei String pq como é cpf e não vou fazer conta melhor deixar assim (eu acho)
    String dataDeEntrada;
    String dataDeSaida;
    private static SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataDeEntrada() {
        return dataDeEntrada;
    }

    public void setDataDeEntrada(String dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }

    public String getDataDeSaida() {
        return dataDeSaida;
    }

    public void setDataDeSaida(String dataDeSaida) {
        this.dataDeSaida = dataDeSaida;
    }
}
