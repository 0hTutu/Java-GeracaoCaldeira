package Exc04_Interface_Enum_TratamentoDeErros;

import Exc04_Interface_Enum_TratamentoDeErros.interfaces.Calculavel;

import java.util.Scanner;

public class Calculadora implements Calculavel {

    Scanner sc = new Scanner(System.in);

    public int nmr(int nmr){
        System.out.println("Numero " + nmr + ":");
        return sc.nextInt();
    }

    @Override
    public void somar(){
        System.out.println(nmr(1) + nmr(2));
    }

    @Override
    public void subtrair() {
        System.out.println(nmr(1) - nmr(2));
    }

    @Override
    public void multiplicar() {
        System.out.println(nmr(1) * nmr(2));
    }

    @Override
    public void dividir() {
        System.out.println(nmr(1) / nmr(2));
    }
}
