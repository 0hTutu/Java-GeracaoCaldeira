import java.util.Scanner;
public class exc10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Seja bem vindo ao conversor de temperatura! De °C para °F");
        System.out.print("Insira a sua temperatura desejada em Celcius:");

        int C = sc.nextInt();
        int F = (C * 9/5) + 32;
        System.out.println(C + " graus Celcius em Fahrenheit são " + F + " graus Fahrenheit.");
    }
}
