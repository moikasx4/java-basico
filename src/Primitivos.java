public class Primitivos {
    public static void main(String [] args){
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bits a " + Byte.SIZE);
        System.out.println("el valor minimo de un tipo byte es " + Byte.MIN_VALUE);
        System.out.println("el valor maximo de un tipo byte es " + Byte.MAX_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroByte = " + numeroShort);
        System.out.println("tipo short corresponde en byte a " + Short.BYTES);
        System.out.println("tipo short corresponde en bits a " + Short.SIZE);
        System.out.println("el valor minimo de un tipo byte es " + Short.MIN_VALUE);
        System.out.println("el valor maximo de un tipo byte es " + Short.MAX_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("tipo int corresponde en bits a " + Integer.SIZE);
        System.out.println("el valor minimo de un tipo byte es " + Integer.MIN_VALUE);
        System.out.println("el valor maximo de un tipo byte es " + Integer.MAX_VALUE);

        long numeroLong = 9223372036854775807L;

        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("tipo long corresponde en bits a " + Long.SIZE);
        System.out.println("el valor minimo de un tipo byte es " + Long.MIN_VALUE);
        System.out.println("el valor maximo de un tipo byte es " + Long.MAX_VALUE);

        var numeroVar = 9223372036854775807f;
        System.out.println("numeroVar = " + numeroVar);

    }

}
