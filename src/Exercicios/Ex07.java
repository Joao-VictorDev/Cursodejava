package Exercicios;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o Valor do Quadrado");
        double lado = ler.nextDouble();

        double area = Math.pow(lado,2);
        System.out.println("A área do quadrado é: " + area);
        System.out.println("O doubro da area do quadrado é: " + (area * 2));
    }
}
