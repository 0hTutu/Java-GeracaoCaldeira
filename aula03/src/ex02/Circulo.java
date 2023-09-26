package ex02;

public class Circulo {
    private double raio;
    private double x = 0;
    private double y = 0;

    public double calcularArea(){
        return Math.PI * this.raio * this.raio;
    }

    public double Circunferencia() {
        return 2 * Math.PI * this.raio;
    }

    private boolean verificaRaio(double raio){
        if(raio > 0){
            this.raio = raio;
            return true;
        } else {
            System.out.println("Insira um numero natural positivo.");
            return false;
        }
    }

}
