package Exc05_RuntimeException;

import java.util.Scanner;

public class Serviço {

    public void RecebeIdade() throws IdadeInvalidaException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira sua idade: ");
        int idade = sc.nextInt();

        if(idade >= 0 || idade <= 150){
            throw new IdadeInvalidaException("Idade inválida! Sua idade tem que ser maior que zero e menor que 150");
        } else {
            System.out.println("Voce está vivo!!!");
        }

    }
}
