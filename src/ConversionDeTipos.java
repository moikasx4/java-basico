public class ConversionDeTipos {

    public static void main(String[] args) {
        var numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);
        
        String realStr = "98.745e-3";
        var realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);
        
        String logicoStr = "true";
        boolean logicoBooleand = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBooleand = " + logicoBooleand);

        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt+10);
        System.out.println("otroNumeroStr2 = " + otroNumeroStr);

        double otroRealDouble = 3.14159;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        otroNumeroStr = String.valueOf(3.14f);
        System.out.println("otroRealStr = " + otroNumeroStr);

        int i = 22768; 
        short s = (short) i; // forzar la conversion su valor maximo es 32767 despues de ese numero abra perdida de informacion.
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);
        
        char b = (char)i;
        System.out.println("b = " + b);

        float f = (float) i;
        System.out.println("f = " + f);
        
        
    }
}
