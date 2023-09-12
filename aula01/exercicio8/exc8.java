import java.util.Scanner;
//ordenador de fila prioritaria
public class exc8 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Seja bem vindo ao cadastro de fila prioritaria!");
        System.out.println("Vamos começar.");
        System.out.print("Insira aqui se você é " + "PCD, " + "Idoso(a), " + "Gestante ou " + "nenhuma das alternativas(insira NA):");
        String alt = sc.nextLine();

        if(alt.equals("PCD") || alt.equals("idoso") || alt.equals("gestante") || alt.equals("idosa")) {
            System.out.println("Você tem direito a fila prioritaria!");
        } else if(alt.equals("NA")){
            System.out.println("Você não tem direito a fila prioritaria.");
        }

    }
}
