package Exc06_Exception;

public class Main {

    public static void main(String[] args) throws SaldoInsuficienteException {

        ContaBancaria conta = new ContaBancaria();

        conta.saque(100);
    }
}
