import javax.swing.*;

public class SistemasNumericos {
    
    public static void main(String[] args) {
        int numeroDecimal = 0;
        String numeroStr  = JOptionPane.showInputDialog(null,
                "Ingrese un nuevo entero");
        try {
              numeroDecimal = Integer.parseInt(numeroStr);
         } catch (NumberFormatException e) {
              e.printStackTrace();
              JOptionPane.showMessageDialog(null, "Error debe ingresar un numero entero");
              main(args);
              System.exit(0);

         }

        String resultadoBinario = "numeroBinario de:" + numeroDecimal + "="
                + Integer.toBinaryString(numeroDecimal);
        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println(resultadoBinario);

        int numeroBinario = 0B111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        String resultadoOctal = "numeroOctal de: " + numeroBinario + "= "
                + Integer.toOctalString(numeroBinario);
        System.out.println(resultadoOctal);

        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        String resultadoHexadecimal  = "numeroHexadecimal de: " + numeroOctal
                + "=" + Integer.toHexString(numeroOctal);
        System.out.println(resultadoHexadecimal);

        int numeroHexadecimal = 0x1f4;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

        String mensaje =  "numeroDecimal = " + numeroDecimal;
               mensaje += "\n"+resultadoBinario;
               mensaje +=  "\n"+resultadoOctal;
               mensaje += "\n"+resultadoHexadecimal;

        JOptionPane.showMessageDialog(null, mensaje);

    }
}
