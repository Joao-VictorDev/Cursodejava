package Exercicios;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a temperatura em farenheit:");
        double f = ler.nextDouble();

        double c = (5 * (f-32) / 9);
        System.out.println("A temperatura " + f + " F e igual a " + c + " C");
    }
}
