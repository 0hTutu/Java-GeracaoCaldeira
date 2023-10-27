package src.Exc3_List_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ListaDeTarefas {
    Scanner sc = new Scanner(System.in);
    List<tarefa> tarefa = new ArrayList<>();

    public void menu(){
        int option;
        do {
            System.out.println("----- Seja bem vindo a lista de tarefas -----");
            System.out.println("|       ");
            System.out.println("| 1 - Adicionar tarefa");
            System.out.println("| 2 - Remover tarefa");
            System.out.println("| 3 - Ver lista");
            System.out.println("| 0 - Sair");
            System.out.println("|       ");
            option = sc.nextInt();
            sc.nextLine(); // <- quebrei a cabeça por conta desse desgranido!!!

            switch (option){
                case(1) -> this.addTarefa();
                case(2) -> this.removeTf();
                case(3) -> this.verTarefas();
                case(0) -> {
                    return;
                }
                default -> System.out.println("opção inválida.");
            }
        } while (true);
    }

    public void addTarefa(){
        tarefa.add(criarItem());
    }

    private tarefa criarItem(){
        String titulo;
        String data;
        String descricao;

        System.out.println("---Nova tarefa---");

        System.out.println("Nome do item: ");
        titulo = sc.nextLine();

        System.out.println("Descrição: ");
        descricao = sc.nextLine();

        System.out.println("data: ");
        data = sc.nextLine();

        return new tarefa(titulo, descricao, data);
    }

    public void removeTf(){
        int tarefa= -1;
        if(this.verTarefas()) {
            do {
                System.out.println("Qual tarefa você deseja excluir?");
                System.out.println("Use 0 para sair");
                tarefa = sc.nextInt();
                if(tarefa != 0){
                    try {
                        this.tarefa.remove(tarefa - 1);
                        System.out.println("Tarefa removida.");
                    }
                    catch (IndexOutOfBoundsException ie) {
                        System.out.println("Tarefa inválida.");
                    }
                }
            } while (tarefa != 0 && !this.tarefa.isEmpty());
        }
    }

    private boolean verTarefas() {
        if (this.tarefa.isEmpty()) {
            System.out.println("ERRO: Lista vazia.");
            return false;
        }
        System.out.println("-----Lista de tarefas-----");
        for (int i = 0; i < tarefa.size(); i++) {
            System.out.printf("%d // %s - %s:\n\t\t-> %s\n", i + 1, this.tarefa.get(i).titulo, this.tarefa.get(i).getDescricao(), this.tarefa.get(i).getDate());
        }
        return true;
    }
}