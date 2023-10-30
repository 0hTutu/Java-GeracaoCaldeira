package src.Exc4_List_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ListaDeCompras {
    Scanner sc = new Scanner(System.in);
    List<Compra> compras = new ArrayList<>();

    public void menu(){
        int option;
        do {

            System.out.println("|     Lista de compras   |");
            System.out.println("| 1 - Adicione um item   |");
            System.out.println("| 2 - Remova um item     |");
            System.out.println("| 3 - Veja a lista       |");
            System.out.println("| 0 - Encerre o programa |");
            System.out.print("   -> ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case(1) -> this.addItem();
                case(2) -> this.removeItem();
                case(3) -> this.verLista();
                case(0) -> {
                    System.out.println("Tchau! Encerrando o programa.");
                    return;
                }
                default -> System.out.println("opção inválida.");
            }
        } while (true);

    }

    private boolean verLista(){
        if(this.compras.isEmpty()){
            System.out.println("ERRO: Lista de compras vazia.");
            return false;
        }
        System.out.println("---Sua lista de compras!---");
        for(int i = 0; i < compras.size(); i++){
            System.out.printf("%d // A compra: (%s) vence em: %s.\n", i + 1, this.compras.get(i).getNome(), this.compras.get(i).getDataDeValidade());
        }
        return true;
    }
    public void addItem(){
        compras.add(criaCompra());
    }

    private Compra criaCompra(){
        String nome;
        String dataDeValidade;

        System.out.println("---Nova compra---");

        System.out.print("Nome da compra: ");
        nome = sc.nextLine();
        System.out.print("Data de validade:");
        dataDeValidade = sc.nextLine();

        return new Compra(nome, dataDeValidade);
    }
    public void removeItem(){
        int compra = -1;
        if(this.verLista()){
            do {
                System.out.println("Qual compra você deseja remover?");
                System.out.println("Utilize (0) para encerrar!");
                compra = sc.nextInt();
                if (compra != 0){
                    try{
                        this.compras.remove(compra - 1);
                    }
                    catch (IndexOutOfBoundsException ie){
                        System.out.println("Compra não existente!");
                    }
                }
            } while(compra != 0 && !this.compras.isEmpty());
        }
    }
}
