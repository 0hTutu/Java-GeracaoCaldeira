package Exc03_TratamentoDeErros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o dividendo: ");
        int dividendo = sc.nextInt();

        try{
            System.out.print("Insira agora o divisor: ");
            int divisor = sc.nextInt();
            if(divisor <= 0 ){
                throw new ArithmeticException("O divisor precisa ser maior que zero.");
            }
        } catch (ArithmeticException e){
            System.err.println("!!!!! ERRO: " + e.getMessage() + " !!!!!");
        }
    }
}
