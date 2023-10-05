import java.util.Scanner;
import java.util.Random;

public class Exc2_RandomArrays {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random randomizer = new Random();
        int[] numbers = new int[10];
        boolean correct = false;

        for(int i = 0; i < numbers.length; i++ ){
            numbers[i] = 1 + randomizer.nextInt(100);
        }

        do {
            System.out.println("entre com um numero de 1 até 100: ");
            int guess = scan.nextInt();

            for(int j = 0; j < numbers.length; j++){
                if(guess == numbers[j]){
                    correct = true;
                }
            }

            if(correct == true){
                System.out.println("Voce acertou! Parabéns!");
            } else{
                System.out.println("Voce errou. Tente novamente.");
            }

        } while (correct == false);

    }
}
