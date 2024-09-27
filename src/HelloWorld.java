public class HelloWorld {

    public static void main(String [] args) {
        String saludar = "Hello world since Java";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());
        
        int numero = 11;
        int numero2 = 5;
        boolean valor = true;
        var numero3 = 15;
        String nombre;

        if( valor ) {
            numero2 = 10;
            System.out.println("numero = " + numero);
        }

        nombre = "Andres";
        if (numero > 10)
        {
            nombre = "Juan";
        }
        System.out.println("nombre = " + nombre);
        int edadPersona = 5;
    }
}
