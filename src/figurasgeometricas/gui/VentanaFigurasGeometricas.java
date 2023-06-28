package figurasgeometricas.gui;

import figurasgeometricas.model.Circulo;
import figurasgeometricas.model.Figura;
import figurasgeometricas.model.Rectangulo;
import java.awt.Graphics;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JFrame;

/**
 *
 * @author FJML1983
 */
public class VentanaFigurasGeometricas extends JFrame {
    //Atributo
    Set<Figura> bolsitaDeFiguras = new HashSet<>();
    
    //Constructor
    public VentanaFigurasGeometricas(){
        setBounds(0, 0, 800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    //Comportamiento (Métodos)
    public void agregarFigura(Figura f){
        bolsitaDeFiguras.add(f);
        this.repaint(); //Obligar a la ejecución del método paint cuando se agregue una figura.
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); // Invocar el método del padre.
    
        //Nuestro código para pintar las figuras que vamos sacando de la bolsita.
        for (Figura figura : bolsitaDeFiguras) {           
            if(figura instanceof Circulo){ //El objeto real es un circulo.
                Circulo c = (Circulo) figura; //Cambiarlo hacia una variable Circulo (casting).
                //Utilizar el estado del objeto para pintar en pantalla.
                g.drawOval((int) c.getX(), 
                           (int) c.getY(), 
                           (int) c.getRadio()*2, 
                           (int) c.getRadio()*2);
                
            }
            if(figura instanceof Rectangulo){ //El objeto real es un rectangulo.
                Rectangulo r = (Rectangulo) figura; //Cambiarlo hacia una variable Rectangulo (casting).
                //Utilizar el estado del objeto para pintar en pantalla.
                g.drawRect((int)r.getX(),
                           (int) r.getY(), 
                           (int) r.getBase(), 
                           (int) r.getAltura());
                
            }
        }
    }

    
    
}
