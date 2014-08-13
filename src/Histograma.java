// Figura 25.20: Histograma.java
// programa de impresion de un histograma

import javax.swing.*;

public class Histograma {
    public static void main(String args[]) {
        int n[] = { 19, 3, 15, 7, 11, 9, 13, 5, 17, 1 };
        String salida = "";
        
        salida += "Elemento\tValor\tHistograma";
        
        for ( int i = 0; i < n.length; i++ )  {
            salida += "\n" + i + "\t" + n[ i ] + "\t";
            for ( int j = 1; j <= n[ i ]; j++)
                salida += "*";
        }
        
        JTextArea areaSalida = new JTextArea(11, 30);
        areaSalida.setText( salida );
        
        JOptionPane.showMessageDialog(null, areaSalida, "Programa de impresion de un Histograma", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}