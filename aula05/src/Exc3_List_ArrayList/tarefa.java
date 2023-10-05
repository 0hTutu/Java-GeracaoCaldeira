package Exc3_List_ArrayList;

import java.text.SimpleDateFormat;

public class tarefa {
    String titulo;
    String date;
    String descricao;
    private static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

