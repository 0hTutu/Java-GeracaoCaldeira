import java.util.Scanner;
public class exc5_a2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira aqui uma palavra: ");
        String word = sc.nextLine();

        int WordSize = word.length();

        int middle = (word.length() / 2);

        System.out.print(word.substring(0, middle));
    }
}
