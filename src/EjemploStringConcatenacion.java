public class EjemploStringConcatenacion {

    public static void main(String[] args) {

        String curso = "Programacion Java";
        String profesor  ="Andres Guzman ";
        String detalle = curso + " con el instructor " + profesor;

        System.out.println("detalle = " + detalle);

        int numeroA = 5;
        int numeroB = 10;

        System.out.println(detalle + numeroA + numeroB);
        System.out.println(detalle + (numeroA + numeroB));
        System.out.println(numeroA + numeroB + detalle);
        
        //String detalle2 = curso.concat(" con ".concat(profesor));
        String detalle2 = curso.concat(" con ").concat(profesor);
        System.out.println("detalle2 = " + detalle2);

    }
}
