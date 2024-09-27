public class EjemploStringMetodos {

    public static void main(String[] args) {
        
        String nombre = "Moises";
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Moises\") = " + nombre.equals("Moises"));
        System.out.println("nombre.equals(\"moises\") = " + nombre.equals("moises"));
        System.out.println("nombre.equalsIgnoreCase(\"moises\") = " + nombre.equalsIgnoreCase("moises"));
        System.out.println("nombre.compareTo(\"Moises\") = " + nombre.compareTo("Moises"));
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(5));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(nombre.length() - 1));
        System.out.println("nombre.substring(2) = " + nombre.substring(2));
        System.out.println("nombre.substring(0,3) = " + nombre.substring(0,3));
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));
        
        String trabaLenguas = "trabalenguas";
        System.out.println("trabaLenguas.replace(\"\",\"a\") = " + trabaLenguas.replace("","a"));
        System.out.println("trabaLenguas = " + trabaLenguas);
        System.out.println("trabaLenguas.indexOf(\"a\") = " + trabaLenguas.indexOf("a"));
        System.out.println("trabaLenguas.lastIndexOf(\"a\") = " + trabaLenguas.lastIndexOf("a"));
        System.out.println("trabaLenguas.indexOf(\"z\") = " + trabaLenguas.indexOf("z"));
        System.out.println("trabaLenguas.contains(\"lenguas\") = " + trabaLenguas.contains("lenguas"));
        System.out.println("trabaLenguas.startsWith(\"lenguas\") = " + trabaLenguas.startsWith("lenguas"));
        System.out.println("trabaLenguas.endsWith(\"uas\") = " + trabaLenguas.endsWith("uas"));
        System.out.println("  trabaLenguas  ");
        System.out.println("  trabaLenguas  ".trim());



        
    }
}
