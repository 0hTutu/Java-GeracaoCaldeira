package Exc04_Interface_Enum_TratamentoDeErros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       try {
          Scanner sc = new Scanner(System.in);
          Calculadora calculadora = new Calculadora();

          System.out.println("Escolha a operação desejada: soma, subtração(sub), multiplicação(mult) ou divisão(div).");
          String op = sc.nextLine().toLowerCase();



          switch (op){
              case "soma": calculadora.somar();
              break;
              case "sub": calculadora.subtrair();
              break;
              case "mult": calculadora.multiplicar();
              break;
              case "div": calculadora.dividir();
              break;
          }

       } catch (ArithmeticException e) {
           System.err.println("ERRO: !!!! NÃO É POSSIVEL DIVIDIR POR ZERO !!!!");
       } catch (IllegalArgumentException e){
           System.err.println("ERRO: Não foi possivel encontrar está operação.");
       }
    }
}