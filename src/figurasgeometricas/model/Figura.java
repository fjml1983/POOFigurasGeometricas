/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas.model;

/**
 *
 * @author FJML1983
 */
public abstract class Figura {
    //Atributos
    protected double x,y;
    
    //Constructores
    public Figura(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    //Comportamiento (Métodos)
    public abstract double calcularArea();
    
    public double getX(){
        return x;
    }

    public double getY() {
        return y;
    }    
    
}
