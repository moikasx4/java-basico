public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "alguna.imagen.xlxs";
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(archivo.length()-3) = " + archivo.substring(archivo.length()-3));
        System.out.println("archivo.substring(i+1) = " + archivo.substring(i+1));



    }
}
