//Crie um programa que leia 3 números, imprima o maior, o menor e a média aritmética.
import java.util.Scanner;

public class exc3 {
    public static void  main(String[] args){

        Scanner nmr = new Scanner(System.in);
        System.out.println("Digite 3 numeros.");
        System.out.println("Primeiro numero:");
            int n1 = nmr.nextInt();
        System.out.println("Segundo numero");
            int n2 = nmr.nextInt();
        System.out.println("Terceiro numero");
            int n3 = nmr.nextInt();

        int maiorN = Integer.max(Integer.max(n1, n2), n3);
        int menorN = Integer.min(Integer.min(n1, n2), n3);
        double media = (n1 + n2 + n3) / 3;

        System.out.println("Concluido!");
        System.out.println("Maior numero: " + maiorN + "." + " Menor numero: " + menorN + ". " + "A média aritmética: " + media + ".");

    }
}
