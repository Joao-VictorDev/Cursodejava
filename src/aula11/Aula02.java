package aula11;

public class Aula02 {
    public static void main(String[] args) {
        // valor 0 a 65.535 (Unicode)
        char o = 111;
        char i = 105;

        System.out.println(""+o+i);

        //valor -128 a 127
        byte b1 = 20;
        System.out.println(b1);

        //valor -32.768 a 32.767
        short s1 = 34;
        System.out.println(s1);

        //valor -2.147.483.648 a 2.147.483.647
        int i1 = 234;
        System.out.println(i1);

        //valor -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
        long l1 = 2992929;
        System.out.println(l1);

        //até 15 dígitos decimais
        double d1 = 122992;
        System.out.println(d1);

        //até 7 dígitos decimais
        float f = 3.14f;
        System.out.println(f);

        //true ou false
        boolean vedadeiro = true;
        boolean falso = false;
        System.out.println(vedadeiro);
        System.out.println(falso);

    }
}
