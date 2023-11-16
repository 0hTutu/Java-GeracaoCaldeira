package Exc01_Interface;

public interface Desenhavel {

    void desenhar();

    class Circulo implements Desenhavel {
        public void desenhar(){
            System.out.println("Desenhando um circulo!");
        }
    }

    class Quadrado implements Desenhavel {
        public void desenhar(){
            System.out.println("Desenhando um quadrado!");
        }
    }
}
