import java.util.Scanner;

public class exc7_a2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 0;
        int acerto = 300000;
            while(i == 0){
                System.out.print("Insira aqui seu palpite: ");
                int palpite = sc.nextInt();
                if(palpite > acerto){
                    System.out.println("UM POUCO MENOS!!!");
                } if(palpite < acerto){
                    System.out.println("UM POUCO MAIS!!!");
                } if(palpite == acerto){
                    System.out.println("correto.");
                    i++;
                }


            }
    }
}
