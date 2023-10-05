package excFigurasGeometricas;

public class Circulo extends FormaGeometrica{
    private double raio;

    public Circulo(double raio){
        verificaRaio(raio);
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

    @Override
    public double CalcularArea() {
        return Math.PI * this.raio * this.raio;
    }

}

