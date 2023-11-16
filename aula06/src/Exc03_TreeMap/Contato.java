package Exc03_TreeMap;

public class Contato {

    String nome;
    String telefone;
    String endereco;
    String local;

    public Contato(String nome, String telefone, String endereco, String local) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.local = local;
    }

    public String getLocal() {
        return local;
    }

    @Override
    public String toString() {
        return " Contato -> " + "Nome: " + nome + ", Telefone: " + telefone + ", Endereço: " + endereco + ", Zona: " + local;
    }
}
