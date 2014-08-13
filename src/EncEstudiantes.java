// Figura 25.19: EncEstudiantes.java
// programa de encuesta a esudiantes
import javax.swing.*;

public class EncEstudiantes {
    public static void main(String args[]) {
        int respuestas[] = { 1, 2, 6, 4, 8, 5, 9, 7, 8, 10,
                             1, 6, 3, 8, 6, 10, 3, 8, 2, 7,
                             6, 5, 7, 6, 8, 6, 7, 5, 6, 6,
                             5, 6, 7, 5, 6, 4, 8, 6, 8, 10 };
        int frecuencia[] = new int[ 11 ];
        String salida = "";
        
        for (   int contestacion = 0; 
                contestacion < respuestas.length; 
                contestacion++ ) 
            ++frecuencia[ respuestas[ contestacion ] ];
        
        salida += "Calificacion\tFrecuencia\n";
        
        for (   int calificacion = 1;
                calificacion < frecuencia.length;
                calificacion++ )
            salida += calificacion + "\t" + frecuencia[ calificacion ] + "\n";
        
        JTextArea areaSalida = new JTextArea(11, 10);
        areaSalida.setText(salida);
        
        JOptionPane.showMessageDialog(null, areaSalida, "Programa de encuesta a estudiantes", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}