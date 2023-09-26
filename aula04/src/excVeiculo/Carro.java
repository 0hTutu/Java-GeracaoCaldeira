package excVeiculo;

public class Carro extends Veiculo {

    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public double CalcularCustoViagem(int distancia) {
        return 0.20*distancia;
    }

}
