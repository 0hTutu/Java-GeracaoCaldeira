package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        System.out.println("""
Requisitos: 
a) Conte o número total de strings na lista. 
b) Encontre a string mais longa presente na lista. 
c) Conte quantas vezes cada string aparece na lista e exiba a contagem para as 5 strings mais frequentes.
""");

        List<String> nomes = Arrays.asList("Arthur", "Melissa", "Jorge", "Jorge", "Jorge", "Gertrude","Lavinia", "Diego", "Matheus" );
        List<String> quantidaDeNomes= nomes.stream().toList();
        System.out.println("Quantidade de Strings dentro da lista: " + quantidaDeNomes.size());

        System.out.println(" ");

        System.out.println("identificando maior String presente na lista: ");
        String gertrude = nomes.get(5);
        gertrude.chars().forEachOrdered(c -> System.out.println((char) c));

       // long quantidadeDeStrings = nomes.stream().count();
       // System.out.println(quantidadeDeStrings);
       // Exercicio incompleto


    }
}