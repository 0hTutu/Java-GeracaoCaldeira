import java.util.Scanner;
public class exc9 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Seja bem vindo ao calculador de data de nascimento! (versão 2023)");
        System.out.print("Insira aqui seu ano de nascimento:");
        int AnoNasc = sc.nextInt();
        System.out.println("");
        int calc = 2023 - AnoNasc;
        System.out.println("Você tem " + calc + " anos de idade!");
    }
}
