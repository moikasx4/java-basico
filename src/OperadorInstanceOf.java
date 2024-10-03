public class OperadorInstanceOf {
    public static void main(String[] args) {
        Object texto = "Creando un objeto de la clase string";
        Number num = 7;
        Boolean b1 = texto instanceof String;
        System.out.println("texto es del tipo string " + b1);
        b1 = texto instanceof Object;
        System.out.println("texto es del tipo object " + b1);
        b1 = texto instanceof Integer;
        System.out.println("texto es del tipo Integer " + b1);
        b1 = num instanceof Integer;
        System.out.println("\"num es del tipo Integer \" + b1 " + b1);
        b1 = num instanceof Number;
        System.out.println("\"num es del tipo Number \" + b1 " + b1);
        Number decimal = 45.54;
        b1 = decimal instanceof Number;
        System.out.println("\"decimal es del tipo Number \" + b1 " + b1);
        b1 = b1 instanceof Boolean;
        System.out.println("\"b1 es del tipo Boolean \" + b1 " + b1);
        b1 = num instanceof Long;
        System.out.println("num es de tipo Long = " + b1);
        b1 = num instanceof Double;
        System.out.println("num es de tipo Double = " + b1);
        b1 = num instanceof Float;
        System.out.println("num es de tipo Float = " + b1);
    }
}
