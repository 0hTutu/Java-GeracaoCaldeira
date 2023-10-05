package excFigurasGeometricas;

public class Triangulo extends FormaGeometrica{
    private double base;
    private double altura;

    @Override
    public double CalcularArea(){
       return (base * altura) / 2;
    }

}
