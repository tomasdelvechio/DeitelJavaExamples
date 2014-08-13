// Figura 24.18: LineasBienvenido.java
// como desplegar texto y lineas

import javax.swing.JApplet;
import java.awt.Graphics;

public class LineasBienvenido extends JApplet {

    /**
     *
     * @param g
     */
    @Override
    public void paint( Graphics g ) {
        g.drawLine(15, 10, 210, 10);
        g.drawLine(15, 30, 210, 30);
        g.drawString("Bienvenido a la programacion en Java!", 25, 25);
    }
}