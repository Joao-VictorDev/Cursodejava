package aula13;

public class Main {
    public static void main(String[] args) {
        //Operadores (Aritiméticos, Lógicos e Relacionais)

        int a = 10;
        int b = 20;

        //Aritiméticos
        System.out.println("Adição: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Mutiplicação: " + (a * b));
        System.out.println("Resto da Divisão: " + (a % b));

        //incremento +1
        a++;
        System.out.println("Incremeto: " + a);

        //descremento -1
        b--;
        System.out.println("Descremento: " + b);

        System.out.println("-----------------------------------Operadores-----------------------------------");
        //Relacionais
        System.out.println("Maior: " + (a > b));
        System.out.println("Menor: " + (a < b));
        System.out.println("Maior ou igual: " + (a >= b));
        System.out.println("Menor ou igual: " + (a <= b));
        System.out.println("igual: " + (a == b));
        System.out.println("diferente: " + (a != b));

        System.out.println("-----------------------------------Operadores-----------------------------------");
        boolean v = true;
        boolean f = false;

        System.out.println(v && f);
        System.out.println(v || f);
        System.out.println(v ^ f);
        System.out.println(!v && f);
    }
}
