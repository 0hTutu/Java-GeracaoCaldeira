package excFigurasGeometricas;

public class Quadrado extends FormaGeometrica{

    private double base;
    private double altura;

    @Override
    public double CalcularArea(){
        return base * altura;
    }
}
