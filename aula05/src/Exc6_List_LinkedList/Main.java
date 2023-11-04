package src.Exc6_List_LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<Reserva> reservas = new LinkedList<>();
        int op;

        do {
            System.out.println("""
                     Bem vindo a (companhia area)!
                     -------------------------
                     1 - Reservar passagem
                     2 - Cancelar reserva
                     3 - Ver lista de reservas
                     -------------------------
                     0 - Encerrar programa
                    --------------------------
                    """);
            System.out.print("  -> ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op){
                case(1) -> {
                    System.out.println("Vamos começar sua reserva!");
                    System.out.print("Insira seu nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Insira seu local: ");
                    String local = sc.nextLine();
                    System.out.print("Insira seu cpf: ");
                    String cpf = sc.nextLine();
                    System.out.print("Insira seu data de entrada: ");
                    String dataDeEntrada = sc.nextLine();
                    System.out.print("Insira seu data de saída: ");
                    String dataDeSaida = sc.nextLine();
                    System.out.println("Reserva concluida!");
                    Reserva reserva = new Reserva(nome, local, cpf, dataDeEntrada, dataDeSaida);
                    reservas.add(reserva);
                }
                case(2) -> {
                    if(reservas.isEmpty()){
                        System.out.println("Não há nenhuma reserva aqui.");
                    } else {
                        System.out.println("""
                    Entre com o identificador da reserva a ser removida
                    Ex: (nome ou cpf).
                    """);
                        String id = sc.nextLine();
                        boolean encontrou = false;

                        for(Reserva reserva : reservas){
                            if(reserva.getNome().equalsIgnoreCase(id) || reserva.getCpf().equals(id)){
                                encontrou = true;
                                reservas.remove(reserva);
                                System.out.println("Reserva removida!");
                                break;
                            }
                            if (!encontrou) {
                                System.out.println("Reserva não encontrada. Porfavor insira uma reserva válida.");
                            }
                        }
                    }

                }
                case(3) -> {
                    System.out.println(reservas);
                }
                case(0)-> {
                    System.out.println("Encerrando o programa... Até mais!");
                    return;
                }
            default -> {
                System.out.println("""
                        
                        Opção inválida! Tente novamente.
                        """);
            }
            }
        } while (true);
    }
}
