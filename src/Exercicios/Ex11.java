package Exercicios;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite Um Numero Inteiro");
        int nuumero1 = ler.nextInt();

        System.out.println("Digite O Segundo Numero Inteiro");
        int nuumero2 = ler.nextInt();

        System.out.println("Digite Um Numero Real");
        double nuumero3 = ler.nextDouble();

        ler.close();
        int res1 = (nuumero1 * nuumero2) * (nuumero2 / 2);
        double res2 = (nuumero1 * 3) + nuumero3;
        double res3 = Math.pow(nuumero3,3);

        System.out.println("Resultado 1: " + res1);
        System.out.println("Resultado 2: " + res2);
        System.out.println("Resultado 3: " + res3);


    }
}
