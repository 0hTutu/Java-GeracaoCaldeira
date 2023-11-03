package src.Exc5_List_LinkedList;

public class Impressao {
    @Override
    public String toString() {
        return "Impressao - " + '\n' +
                "nome = '" + nome + '\'' +
                '\n' + " numeroDePaginas = " + numeroDePaginas;
    }
    String nome;
    int numeroDePaginas;

    public Impressao(String nome, int numeroDePaginas) {
        this.nome = nome;
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }
}
