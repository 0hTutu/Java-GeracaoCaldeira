package Exc03_TreeMap;

import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        TreeMap<String, Contato> Agenda = new TreeMap<>();

        Agenda.put("arthur", new Contato("Arthur", "519940319", "Godofredo 13", "Norte"));
        Agenda.put("lavinia", new Contato("Lavinia", "5599787634", "Farrapos 88", "Norte"));
        Agenda.put("eduardo", new Contato("Eduardo", "519453341", "Mauricio 983", "Leste"));
        Agenda.put("dai", new Contato("Dai", "519903845", "Pará 367", "Sul"));
        Agenda.put("mathues", new Contato("Matheus", "519873453", "Montanhas 301", "Oeste"));

        for(Contato contato : Agenda.values()){
            System.out.println(contato);
        }
        System.out.println(" ");
        String zona = "Norte";

        System.out.println("Pessoas que moram na zona " + zona + ":");
        for(Contato contato : Agenda.values()){
            if(contato.getLocal().equals(zona)){
                System.out.println(contato);
            }

        }

    }

}
