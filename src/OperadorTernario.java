import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {
        
        String variable = 7 == 7 ? "si es vedadero" : "si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 6.2;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double histortia = 0.0;


        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa nota de matematicas = ");
        matematicas = s.nextDouble();
        System.out.println("Ingresa nota de ciencas = ");
        ciencias = s.nextDouble();
        System.out.println("Ingresa nota de historia = ");
        histortia = s.nextDouble();
        promedio = (matematicas + ciencias + histortia) / 3;
        estado = promedio > 5.49 ? "promovido" : "no promovido";
        System.out.println("estado = " + estado);
    }
}
