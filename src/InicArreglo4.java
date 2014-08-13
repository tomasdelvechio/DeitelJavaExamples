// Figura 25.23: InicArreglo4.java
// Inicia un arreglo multidimensional
import java.awt.Container;
import javax.swing.*;

public class InicArreglo4 extends JApplet {
    
    JTextArea areaSalida;
    
    public void init() {
        areaSalida = new JTextArea();
        Container c = getContentPane();
        c.add( areaSalida );
        
        int arreglo1[][] = { { 1, 2, 3}, {4, 5, 6} };
        int arreglo2[][] = { { 1, 2}, { 3 }, {4, 5, 6} };
        
        areaSalida.setText("Los Valores en arreglo1 por fila son\n");
        construyeSalida(arreglo1);
        
        areaSalida.append("\nLos Valores en arreglo2 por fila son\n");
        construyeSalida(arreglo2);
    }
    
    public void construyeSalida( int a[][] ) {
        for ( int i = 0; i < a.length; i++ ) {
            for ( int j = 0; j < a[ i ].length; j++ )
                areaSalida.append( a[i][j] + " ");
            areaSalida.append("\n");
        }
    }
}