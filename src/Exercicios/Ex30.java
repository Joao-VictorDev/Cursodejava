package Exercicios;

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor de a (a != 0): ");
        double a = scan.nextDouble();
        System.out.println("Informe o valor de b: ");
        double b = scan.nextDouble();
        System.out.println("Informe o valor de c: ");
        double c = scan.nextDouble();

        double delta = ((Math.pow(b, 2)) - (4 * a * c));

        if (a == 0) {
            System.out.println("A equação não é de segundo grau, digite outro valor para a: ");
        } else {
            if (delta < 0) {
                System.out.println("Delta negativo, raízes não reais");
            } else if (delta == 0) {
                double raiz = ((-b) + (Math.sqrt(delta))) / (2 * a);
                System.out.printf("Delta igual a 0, possui uma raiz real: %.2f\n", raiz);
            } else if (delta > 0) {
                double r1 = ((-b) + (Math.sqrt(delta))) / (2 * a);
                double r2 = ((-b) - (Math.sqrt(delta))) / (2 * a);
                System.out.println("Delta positivo, possui duas raízes reais:");
                System.out.printf("%.2f ", r1);
                System.out.printf(" %.2f", r2);
            }
        }
        scan.close();
    }
}