package src.Exc3_List_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ListaDeTarefas {
    Scanner sc = new Scanner(System.in);
    List<tarefa> tarefa = new ArrayList<>();

    public void menu(){
        System.out.println("----- Seja bem vindo a lista de tarefas -----");
        System.out.println("|       ");
        System.out.println("| 1 - Adicionar tarefa");
        System.out.println("| 2 - Remover tarefa");
        System.out.println("| 3 - Ver lista");
        System.out.println("| 0 - Sair");
        System.out.println("|       ");
        int option = sc.nextInt();
        do {
            switch (option){
                case(1) -> tarefa.addTarefa();
                case(2) -> tarefa.removeTf();
                case(3) -> tarefa.verTarefas();
                case(0) -> {
                    return;
                }
                default -> System.out.println("opção inválida.");
            }
        } while (option != 0);
    }

    public void addTarefa(){
        tarefa.add(criarItem());
    }

    private tarefa criarItem(){
        String titulo;
        String data;
        String descricao;
        System.out.println("Adcione um item.");
        System.out.print("Nome do item: ");
        titulo = sc.nextLine();
        System.out.print("Descrição: ");
        descricao = sc.nextLine();
        System.out.print("data: ");
        data = sc.nextLine();

        return new tarefa(titulo, descricao, data);
    }

    public void removeTf(){
        int tarefa= -1;

    }

    private boolean verTarefas() {
        if (this.tarefa.isEmpty()) {
            System.out.println("ERRO: Lista vazia.");
            return false;
        }
        System.out.println("-----Lista de tarefas-----");
        for (int i = 0; i < tarefa.size(); i++) {
            System.out.printf("%d // %s - %skg:\n\t\t-> %s \n", i + 1, this.tarefa.get(i).titulo, this.tarefa.get(i).getDescricao(), this.tarefa.get(i).getDate());
        }
        return true;
    }
}