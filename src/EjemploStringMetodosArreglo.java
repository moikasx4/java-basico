public class EjemploStringMetodosArreglo {

    public static void main(String[] args) {
                
        String trabaLenguas = "trabalenguas";
        System.out.println("trabaLenguas.toCharArray() = " + trabaLenguas.toCharArray());
        char[] arreglo = trabaLenguas.toCharArray();
        System.out.println("arreglo.length = " + arreglo.length);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
        }
        System.out.println();
        System.out.println("\ntrabaLenguas = " + trabaLenguas.split("a"));

        String [] arreglo2 = trabaLenguas.split("a");
        int l = arreglo2.length;
        for (int j = 0; j < l; j++) {
            System.out.println(arreglo2[j]);
        }

        String archivo = "algun.archivo.dat";
        String[] archivoArr = archivo.split("[.]"); // \\. [.]
        l = archivoArr.length;
        for (int k = 0; k < l; k++) {
            System.out.println(archivoArr[k]);
        }

        System.out.println("extension = " + archivoArr[l-1]);
    }
}
