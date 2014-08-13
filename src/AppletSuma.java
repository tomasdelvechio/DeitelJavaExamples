// Figura 24.20: AppletSuma.java
// suma dos numeros de punto flotante

import java.awt.*;
import javax.swing.*;

public class AppletSuma extends JApplet {
    
    double suma;
    
    @Override
    public void init() {
        String primerNumero, segundoNumero;
        double numero1, numero2;
        
        primerNumero = JOptionPane.showInputDialog("Introduzca el primer numero");
        segundoNumero = JOptionPane.showInputDialog("Introduzca el segundo numero");
        
        numero1 = Double.parseDouble( primerNumero );
        numero2 = Double.parseDouble( segundoNumero );
        
        suma = numero1 + numero2;
    }
    
    /**
     *
     * @param g
     */
    @Override
    public void paint( Graphics g ) {
        g.drawRect(15, 10, 270, 20);
        g.drawString("La suma es " + suma, 25, 25);
    }
}