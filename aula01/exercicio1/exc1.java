// Crie um programa que leia seu nome e imprima na tela.

import java.util.Scanner;
        public class exc1 {
            public static void main(String[] args){

            Scanner leNome = new Scanner(System.in);

            System.out.println("Digite seu nome aqui:");

            String nome = leNome.nextLine();
            leNome.close();

            System.out.println("Olá, " + nome + ".");

            }
}
