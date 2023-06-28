package figurasgeometricas.model;

public class Circulo extends Figura{

    //Atributos
    protected double radio;

    //Constructores    
    public Circulo(double radio, double x, double y) {
        super(x, y);
        this.radio = radio;
    }    

    public double getRadio() {
        return radio;
    }

    
    
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
