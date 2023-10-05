package excFigurasGeometricas;

public class Retangulo extends FormaGeometrica {

    private double base;
    private double altura;

    @Override
    public double CalcularArea(){
        return (base * altura);
    }

}

