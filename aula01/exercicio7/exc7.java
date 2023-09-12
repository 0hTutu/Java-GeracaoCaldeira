// você deve perguntar para o usuário a idade dele e o seu salário. A pessoa só pode comprar um automóvel se for de maior e ganhar mais de R$ 2.000,00.
import java.util.Scanner;
public class exc7 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double valorMinimo = 2000.00;
        System.out.println("Olá. Seja bem vindo a empresa tal.");
        System.out.println("Vamos começar seu cadastro.");
        System.out.print("Insira aqui sua idade: ");
            String idade = scanner.nextLine();
        System.out.print("Insira aqui seu salario: ");
            double salario = scanner.nextDouble();

        System.out.println("Seu cadastro esta concluido.");

            System.out.println("voce tem " + idade + " anos de idade e recebe " + "R$" + salario + " de salario.");
        System.out.println(" ");
        System.out.print("Voce deseja comprar um carro? responda com sim ou não:");

        String resposta = scanner.next();

        if(resposta.equals("sim")) {
            System.out.println("Vamos conferir seu salario.");
            System.out.println("");
            if(salario > valorMinimo) {
                System.out.println("Seu salario é superior a "+ valorMinimo + ", portanto voce está apto a comprar um carro.");
            } else if (salario < valorMinimo) {
            System.out.println("Seu salario é inferior a "+ valorMinimo + ", portanto voce não está apto a comprar um carro");
            }
        } else if(resposta.equals("não")) {
            System.out.println("Ok. Até mais!");
        }

    }
}
