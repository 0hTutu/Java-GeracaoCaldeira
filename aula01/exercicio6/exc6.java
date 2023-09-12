import java.util.Scanner;
public class exc6 {
    public static void main(String[] args){

        Scanner LeitorDeIdade = new Scanner(System.in);
        System.out.println("Vamos conferir se seu voto é Facultativo ou obrigatorio.");
        System.out.print("Insira aqui sua idade: ");
        int idade = LeitorDeIdade.nextInt();
            if(idade < 16) {
                System.out.println("Não é permitido votar.");

            }   if(idade >= 16 && idade <= 17) {
                System.out.println("Teu voto é facultativo.");
            }   if(idade > 65) {
                System.out.println("Teu voto é facultativo.");
            }   if(idade >= 18 && idade < 65) {
                System.out.println("Teu voto é obrigatorio.");
            }
    }
}
