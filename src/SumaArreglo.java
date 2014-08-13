// Figura 25.18: SumaArreglo.java
// calculo de la suma de los elementos de un arreglo

import javax.swing.*;

public class SumaArreglo {
    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int total = 0;
        
        for ( int i = 0; i < a.length; i++ ) 
            total += a[ i ];
        
        JOptionPane.showMessageDialog(null, "Total de elementos del arreglo: " + total, "Suma de los elementos de un arreglo", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}