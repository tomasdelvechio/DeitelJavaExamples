// Figura 25.21: TiraDado.java
// Tira los dados 6000 veces

import javax.swing.*;

public class TiraDado {
    public static void main(String args[]) {
        int cara, frecuencia[] = new int[ 7 ];
        String salida = "";
        
        for ( int tiro = 1; tiro <= 6000; tiro++ )  {
            cara = 1 + ( int ) ( Math.random() * 6 );
            ++frecuencia[ cara ];
        }
        
        salida += "Cara\tFrecuencia";
        
        for ( cara = 1; cara < frecuencia.length; cara++ )
            salida += "\n" + cara + "\t" + frecuencia[ cara ];
        
        JTextArea areaSalida = new JTextArea(7, 10);
        areaSalida.setText( salida );
        
        JOptionPane.showMessageDialog(null, areaSalida, "Tira los dados 6.000 veces", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}