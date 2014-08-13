// Figura 25.16: InicArreglo2.java
// inicializa un arreglo mediante una declaracion

import javax.swing.*;

public class InicArreglo2 {
    public static void main(String args[]) {
        String salida = "";
        
        int n[] = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
        
        salida += "Subindice\tValor\n";
        
        for ( int i = 0; i < n.length; i++ ) 
            salida += i + "\t" + n[ i ] + "\n";
        
        JTextArea areaSalida = new JTextArea(11, 10);
        areaSalida.setText(salida);
        
        JOptionPane.showMessageDialog(null, areaSalida, "Inicializa un arreglo con valores int", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}