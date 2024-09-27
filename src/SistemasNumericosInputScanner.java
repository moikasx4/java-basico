import javax.swing.*;
import java.io.InputStream;
import java.util.Scanner;

public class SistemasNumericosInputScanner {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un nuevo entero");
//        String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;
        /**
        String numeroStr  = JOptionPane.showInputDialog(null,
                "Ingrese un nuevo entero");**/
        try {
              numeroDecimal = scanner.nextInt();
              conversion(numeroDecimal);
         } catch (Exception e) {
              e.printStackTrace();
            //  JOptionPane.showMessageDialog(null, "Error debe ingresar un numero entero");
              main(args);
              System.exit(0);

         }

    }
    private static String conversion(Integer numeroDecimal) {

        String resultadoBinario = "numeroBinario " + Integer.toBinaryString(numeroDecimal);

        String resultadoOctal = "numeroOctal " +  Integer.toOctalString(numeroDecimal);

        String resultadoHexadecimal  = "numeroHexadecimal " + Integer.toHexString(numeroDecimal);

        String mensaje =  "numeroDecimal = " + numeroDecimal;
        mensaje += "\n"+resultadoBinario;
        mensaje +=  "\n"+resultadoOctal;
        mensaje += "\n"+resultadoHexadecimal;

        //JOptionPane.showMessageDialog(null, mensaje);
        System.out.println(mensaje);
        return mensaje;
    }
}
