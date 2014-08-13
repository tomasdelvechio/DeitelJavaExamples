import javax.swing.JOptionPane;

public class Suma {
    public static void main( String args[] ) {
        String primerNumero, segundoNumero;
        int numero1, numero2, suma;
        
        primerNumero = JOptionPane.showInputDialog("Introduzca el primer numero");
        segundoNumero = JOptionPane.showInputDialog("Introduzca el segundo numero");
        
        numero1 = Integer.parseInt( primerNumero );
        numero2 = Integer.parseInt( segundoNumero );
        
        suma = numero1 + numero2;
        
        JOptionPane.showMessageDialog(null, "La suma es " + suma, "Resultados", JOptionPane.PLAIN_MESSAGE);
        
        System.exit(0);
        
    }
}