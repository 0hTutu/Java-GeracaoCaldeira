import java.util.ArrayList;
import java.util.Scanner;

public class exc6_a2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> array = new ArrayList<>();
        System.out.print("Insira uma palavra: ");
        String word = sc.nextLine();

        for(int i = word.length() - 1; i >= 0; i--){
            array.add(word.charAt(i));
        }
        System.out.print(array);
    }
}
