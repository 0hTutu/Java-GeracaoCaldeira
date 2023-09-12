import java.util.Scanner;
public class exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Entre com o primeiro numero");
        int n1 = sc.nextInt();
        System.out.printf("Entre com o segundo numero");
        int n2 = sc.nextInt();
        System.out.printf("Entre com a condicional. Ex: +, -, *, /");
        String condicao = sc.nextLine();

        if(condicao == "+"){
            System.out.println("O resultado " + n1 + n2);
        }

    }
}