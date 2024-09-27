public class PrimitivosFloat {
    static float varFlotanteI;

    public static void main(String[] args) {
        
        float realFloat = 1.0f;
        System.out.println("realFloat = " + realFloat);

        System.out.println("tipo float corresponde en byte a " + Float.BYTES);
        System.out.println("tipo float corresponde en bits a " + Float.SIZE);
        System.out.println("el valor minimo de un tipo float es " + Float.MIN_VALUE);
        System.out.println("el valor maximo de un tipo float es " + Float.MAX_VALUE);

        float realFloat2 = 2.12e3f; //Son equivalentes 2120f;
        System.out.println("realFloat2 = " + realFloat2);
        
        float realFloat3 = 1.5e4f; //15000
        System.out.println("realFloat = " + realFloat3);
        
        float realFloat4 = 1.5e-10f; //0.0000000015
        System.out.println("realFloat4 = " + realFloat4);

        double realDouble = 3.4028235E39d;

        System.out.println("realDouble = " + realDouble);

        System.out.println("tipo double corresponde en byte a " + Double.BYTES);
        System.out.println("tipo double corresponde en bits a " + Double.SIZE);
        System.out.println("el valor minimo de un tipo double es " + Double.MIN_VALUE);
        System.out.println("el valor maximo de un tipo double es " + Double.MAX_VALUE);

        var varFlotante = 3.1416;
        System.out.println("varFlotante = " + varFlotante);
        System.out.println("varFlotanteI = " + varFlotanteI);
    }
}
