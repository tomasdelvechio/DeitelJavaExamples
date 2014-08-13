// Figura 25.12: Craps.java
// Craps

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Craps extends JApplet implements ActionListener {
    // Constantes para el estado del juego
    final int GANA = 0, PIERDE = 1, CONTINUAR = 2;
    
    // Variables
    boolean primerTiro = true;
    int sumaDeDados = 0;
    int miPunto = 0;
    int estadoDelJuego = CONTINUAR;
    
    JLabel etiquetaDado1, etiquetaDado2, etiquetaSuma, etiquetaPunto;
    JTextField primerDado, segundoDado, suma, punto;
    JButton tiro;
    
    public void init() {
        Container c = getContentPane();
        c.setLayout( new FlowLayout() );
        
        etiquetaDado1 = new JLabel("Dado 1");
        c.add(etiquetaDado1);
        primerDado = new JTextField(10);
        primerDado.setEditable(false);
        c.add(primerDado);
        
        etiquetaDado2 = new JLabel("Dado 2");
        c.add(etiquetaDado2);
        segundoDado = new JTextField(10);
        segundoDado.setEditable(false);
        c.add(segundoDado);
        
        etiquetaSuma = new JLabel("La suma es");
        c.add(etiquetaSuma);
        suma = new JTextField(10);
        suma.setEditable(false);
        c.add(suma);
        
        etiquetaPunto = new JLabel("El puntaje es");
        c.add(etiquetaPunto);
        punto = new JTextField(10);
        punto.setEditable(false);
        c.add(punto);
        
        tiro = new JButton("Tirar dados");
        tiro.addActionListener(this);
        c.add(tiro);
    }
    
    public void actionPerformed( ActionEvent e ) {
        jugar();
    }
    
    public void jugar() {
        if( primerTiro ) {
            sumaDeDados = tiroDados();
            
            switch( sumaDeDados ) {
                case 7: case 11:
                    estadoDelJuego = GANA;
                    punto.setText("");
                    break;
                case 2: case 3: case 12:
                    estadoDelJuego = PIERDE;
                    punto.setText("");
                    break;
                default:
                    estadoDelJuego = CONTINUAR;
                    miPunto = sumaDeDados;
                    punto.setText(Integer.toString(miPunto));
                    primerTiro = false;
                    break;
            }
        } else {
            sumaDeDados = tiroDados();
            
            if ( sumaDeDados == miPunto )
                estadoDelJuego = GANA;
            else
                if ( sumaDeDados == 7 )
                    estadoDelJuego = PIERDE;
        }
        
        if ( estadoDelJuego == CONTINUAR )
            showStatus("Tire de nuevo.");
        else {
            if ( estadoDelJuego == GANA )
                showStatus("Jugador Gana. Haga clic en Tirar dados para jugar de nuevo");
            else
                showStatus("Jugador Pierde. Haga clic en Tirar dados para jugar de nuevo");
            
            primerTiro = true;
        }
    }
    
    public int tiroDados() {
        int dado1, dado2, trabajaSuma;
        
        dado1 = 1 + ( int ) ( Math.random() * 6 );
        dado2 = 1 + ( int ) ( Math.random() * 6 );
        trabajaSuma = dado1 + dado2;
        
        primerDado.setText(Integer.toString(dado1));
        segundoDado.setText(Integer.toString(dado2));
        suma.setText(Integer.toString(trabajaSuma));
        
        return trabajaSuma;
    }
}
