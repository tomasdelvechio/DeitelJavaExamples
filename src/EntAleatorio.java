// Figura 25.11: EntAleatorio.java
// Enteros aleatorios escalados y desplazados

import javax.swing.JOptionPane;

public class EntAleatorio {
    public static void main( String args[] ) {
        int valor;
        String salida = "";
        
        for ( int i = 1; i <= 20; i++ ) {
            valor = 1 + (int) ( Math.random() * 6 );
            salida += valor + " ";
            
            if( i % 5 == 0 )
                salida += "\n";
            
        }
        
        JOptionPane.showMessageDialog(null, salida, "20 numeros aleatorios del 1 al 6", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}