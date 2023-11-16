package Exc04_LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Double> produtosPrecos = new LinkedHashMap<>();

        produtosPrecos.put("Alface", 10.50);
        produtosPrecos.put("Queijo", 7.50);
        produtosPrecos.put("Carne", 48.90);
        produtosPrecos.put("Nutella", 39.90);

        for(Map.Entry<String, Double> entry : produtosPrecos.entrySet()){
            System.out.println("Produto: " + entry.getKey() + " | Valor: " + entry.getValue() + "R$");
        }

    }
}
