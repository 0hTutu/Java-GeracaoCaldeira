package DNGSBank;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();
        conta.setSaldo(700);
        conta.pix(300.0);
        System.out.println(conta.getSaldo());
    }
}
