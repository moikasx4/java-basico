import java.util.Scanner;

public class DatosFactura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese datos de factura \n");
        try {
            System.out.println("Ingrese numero de factura");
            Integer numeroFactura = scanner.nextInt();
            String rfcEmisor = "CEDL940521HLD";
            System.out.println("Ingresa RFC del receptor");
            String rfcReceptor = scanner.next();
            System.out.println("Ingresa el concepto");
            String concepto = scanner.next();
            System.out.println("Ingresa el importe");
            double importe = scanner.nextFloat();
            double iva = importe * 0.16;
            System.out.println("iva = " + iva);
            double importeTotal = importe + iva;
            System.out.println("importeTotal = " + importeTotal);

            String mensajeParte1 = "La factura producto de oficina tiene un total de ";
            String mensajeParte2 = " con un impuesto de ";
            String mensajeParte3 = " y el monto total despues de impuesto es de ";
            System.out.println(mensajeParte1+importe+mensajeParte2+iva+mensajeParte3+importeTotal);

        } catch (Exception e) {
            System.out.println(e);
            main(args);
            System.exit(0);
        }


    }
}
