package Exercicios;

import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro lado do triangulo: ");
        int n1 = scan.nextInt();
        System.out.println("Informe o segundo lado do triângulo: ");
        int n2 = scan.nextInt();
        System.out.println("Informe o terceiro lado do triângulo: ");
        int n3 = scan.nextInt();

        if ((n1 + n2 > n3) || (n1 + n3 > n2) || (n2 + n3 > n1)) {
            if ((n1 != n2) && (n1 != n3) && (n2 != n3)) {
                System.out.println("Triângulo escaleno");
            } else if ((n1 == n2) && (n1 == n3) && (n2 == n3)) {
                System.out.println("Triângulo equilátero");
            } else {
                System.out.println("Triângulo isósceles");
            }
        } else {
            System.out.println("Não é um triângulo");
        }

        scan.close();
    }
}