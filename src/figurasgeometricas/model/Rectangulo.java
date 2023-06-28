/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas.model;

/**
 *
 * @author FJML1983
 */
public class Rectangulo extends Figura{

    protected double base, altura;

    public Rectangulo(double base, double altura, double x, double y) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }
    
    @Override
    public double calcularArea() {
        return base * altura;
    }
}
