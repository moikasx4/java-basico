public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        var decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter: " + (decimal == caracter));

        char simbolo = '@';

        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter: " + (simbolo == caracter));

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("tipo char corresponde en byte a " + System.lineSeparator() + Character.BYTES);
        System.out.println("tipo char corresponde en bits a " + Character.SIZE);
        System.out.println("el byte minimo de un tipo char es " + Character.MIN_VALUE);
        System.out.println("el byte maximo de un tipo char es " + Character.MAX_VALUE);
    }
}
