package excVeiculo;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Ferrari", "FNXX", 2011);
        Veiculo moto = new Moto("Yahama", "XJ6", 2009);

        System.out.println("Viagem até Chui de carro: " + carro.CalcularCustoViagem(410));
        System.out.println("Viagem até Tramandai de moto: " + carro.CalcularCustoViagem(120));
    }
}