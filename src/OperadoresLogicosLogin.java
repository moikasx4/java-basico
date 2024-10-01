import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
       /** String [] usernames = new String[3];
        String [] passwords  = new String[3];
        usernames[0] = "moikasx4";
        passwords[0]  = "123456";
        usernames[1] = "dinoco";
        passwords[1] = "dinoco";
        usernames[2] = "flash";
        passwords[2] = "flash"; **/

        String [] usernames = {"moikasx4","dinoco", "flash"};
        String [] passwords  = {"123456", "dinoco", "flash"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el usuario");
        String u = scanner.next();
        System.out.println("Ingresa el password");
        String p = scanner.next();

        boolean esAutenticado = false;
        for (int i = 0; i < usernames.length; i++) {

            esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p)) ? true : esAutenticado;
//            if (usernames[i].equals(u) && passwords[i].equals(p)) {
//                esAutenticado = true;
//                System.out.println("esAutenticado = " + esAutenticado);
//                break;
//            }

        }
//        if (esAutenticado) {
//            System.out.println("Bienvenido Usuario " + u);
//        } else {
//            System.out.println("usuario o contraseña incorrectos");
//            main(args);
//        }
        String mensaje = esAutenticado ? "Bienvenido usuario:".concat(u).concat("¡")
                : "Usuario o password icorrectos";
        System.out.println("mensaje = " + mensaje);
    }
}
