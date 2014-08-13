// Figura 25.12: TiraDados.java
// tira 6.000 veces un dado de seis lados

import javax.swing.*;

public class TiraDados {
    public static void main( String args[] ) {
        int frecuencia1 = 0, frecuencia2 = 0,
            frecuencia3 = 0, frecuencia4 = 0,
            frecuencia5 = 0, frecuencia6 = 0, cara;
        
        for ( int tiro = 1; tiro <= 6000; tiro++ ) {
            cara = 1 + (int) ( Math.random() * 6 );
            
            switch ( cara ) {
                case 1:
                    ++frecuencia1;
                    break;
                case 2:
                    ++frecuencia2;
                    break;
                case 3:
                    ++frecuencia3;
                    break;
                case 4:
                    ++frecuencia4;
                    break;
                case 5:
                    ++frecuencia5;
                    break;
                case 6:
                    ++frecuencia6;
                    break;
            }
        }
        
        JTextArea areaSalida = new JTextArea(7, 10);
        
        areaSalida.setText(
                "Cara\tFrecuencia" +
                "\n1\t" + frecuencia1 +
                "\n2\t" + frecuencia2 +
                "\n3\t" + frecuencia3 +
                "\n4\t" + frecuencia4 +
                "\n5\t" + frecuencia5 +
                "\n6\t" + frecuencia6 );
        
        JOptionPane.showMessageDialog(null, areaSalida, "Lanzando 6000 veces el dado", JOptionPane.INFORMATION_MESSAGE );
        System.exit(0);
    }
}