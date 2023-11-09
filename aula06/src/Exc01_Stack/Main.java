package Exc01_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Livro> pilhaDeLivros = new Stack<>();

        Scanner sc = new Scanner(System.in);

        int nmroDeLivros;

        System.out.println("Quantos livros voce deseja adicionar?");
        nmroDeLivros = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < nmroDeLivros; i++){
            System.out.println("Qual o nome do livro?");
            String titulo = sc.nextLine();
            System.out.println("Qual a categoria do livro?");
            String categoria = sc.nextLine();

           pilhaDeLivros.push(new Livro(titulo, categoria));
        }
    }
}
