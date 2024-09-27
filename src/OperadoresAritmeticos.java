import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int i = 1, j = 2;
        int suma = i + j;
        System.out.println("suma = " + suma);
        System.out.println("i + j = " + (i + j));
        
        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("(i-j) = " + (i-j));

        int producto = i * j;
        System.out.println("producto = " + producto);

        int div = i / j;
        System.out.println("div = " + div);

        float div2 = (float) i / j;
        System.out.println("div2 = " + div2);

        int resto = i % j;
        System.out.println("resto = " + resto);

        int numero  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        if (numero % 2 == 0) {
            System.out.println("numero = " + numero);
        } else {
            System.out.println("El numero es impar");
        }


    }
}
