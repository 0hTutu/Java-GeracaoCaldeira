package src.Exc4_List_ArrayList;

import java.text.SimpleDateFormat;

public class Compra {
    String nome;
    String dataDeValidade;

    private static SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }
}
