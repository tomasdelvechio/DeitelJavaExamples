// Figura 24.14: AppletBienvenido.java
// Un primer applet en java

import javax.swing.JApplet;
import java.awt.Graphics;

public class AppletBienvenido extends JApplet {

    /**
     *
     * @param g
     */
    @Override
    public void paint( Graphics g ) {
        g.drawString("Bienvenido a la programacion en Java!", 25, 25);
    }
}