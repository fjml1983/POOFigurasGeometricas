/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figurasgeometricas.main;

import figurasgeometricas.gui.VentanaFigurasGeometricas;
import figurasgeometricas.model.Circulo;
import figurasgeometricas.model.Figura;
import figurasgeometricas.model.Rectangulo;
import figurasgeometricas.model.Triangulo;

/**
 *
 * @author FJML1983
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        //Esto no se podría hacer pues Figura es abstracta.
        //Figura f1 = new Figura();
        
        Circulo c1 = new Circulo(20.5, 50, 50);
        Circulo c2 = new Circulo(50, 100, 50);
        Circulo c3 = new Circulo(45, 150, 100);
        Rectangulo r1 = new Rectangulo(20, 40.5, 10, 10);
        Triangulo t1 = new Triangulo(50, 20, 0, 0);
                
        System.out.println("El area del circulo es " + c1.calcularArea());
        System.out.println("El area del rectangulo es " + r1.calcularArea());
        System.out.println("El area del triangulo es " + t1.calcularArea());
    
        VentanaFigurasGeometricas window = new VentanaFigurasGeometricas();
        window.agregarFigura(c1);
        window.agregarFigura(r1);
        window.agregarFigura(t1);
        window.agregarFigura(c2);
        window.agregarFigura(c3);
        
    
    
    }

}
