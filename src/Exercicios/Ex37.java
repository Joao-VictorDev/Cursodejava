package Exercicios;

import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double valor = scan.nextDouble();

        if (valor == (int) valor) {
            System.out.println("Inteiro");
        } else {
            System.out.println("Decimal");
        }
    }
}