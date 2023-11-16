package Exc02_Enum;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Que dia da semana é hoje?");
        String DiaSemana = sc.nextLine().toUpperCase();
        switch (DiaSemana) {
            case "SEGUNDA":
                System.out.println("Segunda feira mais uma vez T_T");
                break;
            case "TERCA":
                System.out.println("Terça feira ainda?");
                break;
            case "QUARTA":
                System.out.println("Se amanhã é quinta, depois de amanhã é sexta GRAÇAS A DEUS");
                break;
            case "QUINTA":
                System.out.println("Amanhã já é SEXTAAAAAAAAAA");
                break;
            case "SEXTA":
                System.out.println("SEXTOOOOOUUUUUU OBRIGADO DEUS");
                break;
            case "SABADO":
                System.out.println("Sabadasso com os cria, quero guerra com ninguém...");
                break;
            case "DOMINGO":
                System.out.println("domingo á noite.");
                break;
            default:
                System.out.println("calma lá patrão isso ai não é dia da semana não!");
        }
    }
}
