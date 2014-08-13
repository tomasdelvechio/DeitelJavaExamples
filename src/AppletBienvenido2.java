// Figura 24.16: AppletBienvenido2.java
// como desplegar varias cadenas

import javax.swing.JApplet;
import java.awt.Graphics;

public class AppletBienvenido2 extends JApplet {

    /**
     *
     * @param g
     */
    @Override
    public void paint( Graphics g ) {
        g.drawString("Bienvenido a", 25, 25);
        g.drawString("la programacion en Java!", 25, 40);
    }
}