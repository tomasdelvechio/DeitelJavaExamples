// Figura 25.8: CuadradoEnt.java
// metodo cuadrado definido por el programador

import java.awt.Container;
import javax.swing.*;

public class CuadradoEnt extends JApplet {
    @Override
    public void init() {
        String salida = "";
        
        JTextArea areaSalida = new JTextArea(10, 20);
        
        // Obtiene el area de visualizacion del componente GUI del applet
        Container c = getContentPane();
        
        // Adjunta el areaSalida al contenedor c
        c.add( areaSalida );
        
        int resultado;
        
        for ( int x = 1; x <= 10; x++ ) {
            resultado = cuadrado( x );
            salida += "El cuadrado de " + x + " es " + resultado + "\n";
        }
        
        areaSalida.setText( salida );
    }
    
    public int cuadrado( int y ) {
        return y * y;
    }
    
}