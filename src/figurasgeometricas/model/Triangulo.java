/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas.model;

/**
 *
 * @author FJML1983
 */
public class Triangulo extends Figura {
    protected double b, h;
    
    public Triangulo(double base, double altura,double x, double y){
        super(x, y);
        this.b = base;
        this.h = altura;
    }

    @Override
    public double calcularArea() {
        return b * h / 2; 
    }
    
}
