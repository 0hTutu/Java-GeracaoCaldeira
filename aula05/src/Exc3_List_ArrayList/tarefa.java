package src.Exc3_List_ArrayList;

import java.text.SimpleDateFormat;

public class tarefa {
    String titulo;
    String data;
    String descricao;
    private static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    public tarefa(String titulo, String descricao, String data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDate() {
        return data;
    }

    public void setDate(String date) {
        this.data = date;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public static SimpleDateFormat getFormatter() {
        return formatter;
    }

    public static void setFormatter(SimpleDateFormat formatter) {
        tarefa.formatter = formatter;
    }

}

