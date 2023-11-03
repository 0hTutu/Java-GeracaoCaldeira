package src.Exc5_List_LinkedList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<Impressao> filaDeImp = new LinkedList<>();
        int op;
        do {
            System.out.println(""" 
                   
                   ==Bem vindo á fila de impressão==
                        1 - Adcionar documento
                        2 - Ver documentos
                    
                        0 - Encerrar programa
                    """);
            System.out.print("-> ");


            op = sc.nextInt();
            sc.nextLine();

            switch (op){
                case (1) -> {
                    System.out.print("Insira o nome do documento:");
                    String nome = sc.nextLine();
                    System.out.print("Insira o numero de páginas do documento:");
                    int numeroDePaginas = sc.nextInt();
                    Impressao imp = new Impressao(nome, numeroDePaginas);
                    filaDeImp.add(imp);
                }

                case (2) -> {
                    if(filaDeImp.isEmpty()){
                        System.out.println("Não há nenhum documento aqui.");
                    }
                    else {
                        for (int i = 0; i < filaDeImp.size(); i++) {
                            System.out.println(filaDeImp.get(i));
                        }
                    }


                }

                case (0) -> {
                    return;
                }

            default -> System.out.println("Esta opção não existe!");
        }
    } while (true);
}
}
