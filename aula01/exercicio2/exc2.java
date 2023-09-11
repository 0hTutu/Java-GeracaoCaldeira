// Crie um programa que receba 2 números e imprima na tela.
import java.util.Scanner;
public class exc2 {
    public static void main(String[] args){

        Scanner recebeNmr = new Scanner(System.in);
        System.out.println("insira o primeiro numero :");
        int nmr1 = recebeNmr.nextInt();
        System.out.println("insira o segundo numero:");
        int nmr2 = recebeNmr.nextInt();
        recebeNmr.close();
        System.out.println("Os numero inseridos foram: " + nmr1 + " e " + nmr2);

    }
}
