// Figura 25.15: InicArreglo.java
// inicializa un arreglo

import javax.swing.*;

public class InicArreglo {
    public static void main(String args[]) {
        String salida = "";
        int n[];
        
        n  = new int[ 10 ];
        
        salida += "Subindice\tValor\n";
        
        for ( int i = 0; i < n.length; i++ ) 
            salida += i + "\t" + n[ i ] + "\n";
        
        JTextArea areaSalida = new JTextArea(11, 10);
        areaSalida.setText(salida);
        
        JOptionPane.showMessageDialog(null, areaSalida, "Inicializa un arreglo con valores int", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}