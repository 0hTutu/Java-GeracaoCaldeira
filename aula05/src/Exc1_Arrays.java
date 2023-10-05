import java.util.Scanner;

public class Exc1_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        System.out.print("Insira o primeiro numero: ");
        numeros[0] = sc.nextInt();
        System.out.print("Insira o segundo numero: ");
        numeros[1] = sc.nextInt();
        System.out.print("Insira o terceiro numero: ");
        numeros[2] = sc.nextInt();
        System.out.print("Insira o quarto numero: ");
        numeros[3] = sc.nextInt();
        System.out.print("Insira o quinto numero: ");
        numeros[4] = sc.nextInt();

        System.out.println("Os numeros inseridos foram: " + numeros[0] + " " + numeros[1] + " " + numeros[2] + " " +  numeros[3] + " " + numeros[4]);
    }
}