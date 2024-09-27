public class EjemploStringTestRendimientoConcatenacion {

    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;
        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for(int i = 0; i < 100000; i++) {

            //c = c.concat(a).concat(b).concat("\n"); // 500 => 2ms, 1000 => 18ms, 10000 => 584ms, 100000 => 11100ms
            //c += a + b + "\n"; //500 => 54 ms, 1000 => 54ms, 10000 => 254ms, 100000 => 4271
            sb.append(a).append(b).append("\n"); // 500 => 1ms, 1000 => 3ms, 10000 => 7ms, 100000 => 34ms


        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());


    }
}
