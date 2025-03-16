package Exercicios;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a temperatura em celsius:");
        double c = ler.nextDouble();

        double f = c * 1.8 + 32;
        System.out.println("A temperatura " + c + " C e igual a " + f + " F");
    }
}
