package Exercicios;

import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        double n1 = scan.nextDouble();
        System.out.println("Informe a segunda nota: ");
        double n2 = scan.nextDouble();
        System.out.println("Informe a terceira nota: ");
        double n3 = scan.nextDouble();

        double media = (n1 + n2 + n3) / 3;
        System.out.printf("Média: %.2f\n", media);

        if (media == 10) {
            System.out.println("Aprovado com distinção");
        } else if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media < 7) {
            System.out.println("Reprovado");
        }
    }
}