package Exc02_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Integer> ageda = new HashMap<>();

        ageda.put("Tereza", 24);
        ageda.put("Marcela", 30);
        ageda.put("Lucas", 14);
        ageda.put("Eusébio", 71);
        ageda.put("Eufanir", 83);

        System.out.println(ageda.get("Tereza"));
        verifica(ageda);

    }
    public static void verifica(Map<String, Integer> ageda){
        for (Map.Entry<String, Integer> entrada : ageda.entrySet()){
            if(entrada.getValue() >= 65){
                System.out.println(entrada.getKey() + "está na terceira idade.");
            }
        }
    }
}
