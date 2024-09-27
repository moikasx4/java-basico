public class OperadoresAsignacion {

    public static void main(String[] args) {
        int i = 5;
        System.out.println("i = " + i);
        int j = i + 5;
        System.out.println("j = " + j);
        i+=2;      //i = i + 2;
        System.out.println("i = " + i);
        i+=5;
        System.out.println("i = " + i);
        j-=1;
        System.out.println("j = " + j);
        j*=3;
        System.out.println("j = " + j);

        String sqlString = "SELECT* FROM CLIENTE as C";
        sqlString += "WHERE C.NOMBRE = 'MOISES' ";
        sqlString += "AND C.ACTIVO = 1";
        System.out.println("sqlString = " + sqlString);

    }
}
