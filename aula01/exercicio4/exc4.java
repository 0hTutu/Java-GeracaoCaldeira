//Crie um programa que leia o valor do salário mínimo e o valor do salário de um usuário, calcule a quantidade de salários mínimos que esse usuário ganha e imprima o resultado, assuma que o salário mínimo é R$1.320.
import java.util.Scanner;
public class exc4 {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        double salarioMin = 1320.0;
        System.out.println("O salario minimo é: R$" + salarioMin + ".");
        System.out.println("Insira seu salario:");
        double salarioUser = Double.parseDouble(leitor.next());
        double QuantidadeDeSlrMin = salarioMin / salarioUser;

        System.out.printf("\nVocê recebe: %.2f salarios minimos", QuantidadeDeSlrMin);

    }
}
