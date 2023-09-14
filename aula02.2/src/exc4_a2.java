import java.util.Scanner;
public class exc4_a2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int i = 0;
    while(i == 0) {
        System.out.print("Entre com o primeiro numero: ");
        int n1 = sc.nextInt();
        System.out.print("Entre com o segundo numero: ");
        int n2 = sc.nextInt();
        System.out.print("Escolha o operação: + - * / ou (n) para sair: ");
        char condicao = sc.next().charAt(0);

        switch (condicao) {
            case '*' -> System.out.println("o resultado é " + (n1 * n2));
            case '/' -> System.out.println("o resultado é " + (n1 / n2));
            case '-' -> System.out.println("o resultado é " + (n1 - n2));
            case '+' -> System.out.println("o resultado é " + (n1 + n2));
            case 'n' -> {
                i++;
            }
        }
        }
    }
}