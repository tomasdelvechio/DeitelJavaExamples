// Figura 25.17: InicArreglo3.java
// inicializa un arreglo

import javax.swing.*;

public class InicArreglo3 {
    public static void main(String args[]) {
        final int TAMANIO_ARREGLO = 10;
        String salida = "";
        int n[];
        
        n  = new int[ TAMANIO_ARREGLO ];
        
        for ( int i = 0; i < n.length; i++ ) {
            n[ i ] = 2 + 2 * i;
        }
        
        salida += "Subindice\tValor\n";
        
        for ( int i = 0; i < n.length; i++ ) 
            salida += i + "\t" + n[ i ] + "\n";
        
        JTextArea areaSalida = new JTextArea(11, 10);
        areaSalida.setText(salida);
        
        JOptionPane.showMessageDialog(null, areaSalida, "Inicializa un arreglo con valores int", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}