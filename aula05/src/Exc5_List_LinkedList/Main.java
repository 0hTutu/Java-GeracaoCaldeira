package src.Exc5_List_LinkedList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<String> imp = new LinkedList<>();
        int op;
        do {
            System.out.println("-Bem vindo á fila de impressão-");
            System.out.println("1 - Adcionar documento");
            System.out.println("2 - Ver documentos");
            System.out.println("3 - Remover documento");
            System.out.println("0 - Encerrar programa");

            sc.nextLine();
            op = sc.nextInt();

            switch (op){
                case 1:
                    System.out.println("");
                    break;

                case 2:
                    System.out.println();
                    break;

                case 3:
                    System.out.println();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Esta opção não existe!");
                    break;
            }
        } while (true);
    }
}
