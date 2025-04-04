package Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Digite o valor do saque: ");
        double saque = scan.nextDouble();

        if (saque < 10 || saque > 600) {
            System.out.println("Valor(es) não disponível(is)");
        } else {

            int n100, n50, n10, n5, n1;

            n100 = (int) (saque / 100);
            saque -= 100 * n100;
            saque = Double.parseDouble(df.format(saque));

            n50 = (int) (saque / 50);
            saque -= 50 * n50;
            saque = Double.parseDouble(df.format(saque));

            n10 = (int) (saque / 10);
            saque -= 10 * n10;
            saque = Double.parseDouble(df.format(saque));

            n5 = (int) (saque / 5);
            saque -= 5 * n5;
            saque = Double.parseDouble(df.format(saque));

            n1 = (int) (saque / 1);
            saque -= 1 * n1;
            saque = Double.parseDouble(df.format(saque));

            System.out.println("NOTAS:");
            System.out.printf("%d nota(s) de R$100\n", n100);
            System.out.printf("%d nota(s) de R$50\n", n50);
            System.out.printf("%d nota(s) de R$10\n", n10);
            System.out.printf("%d nota(s) de R$5\n", n5);
            System.out.printf("%d nota(s) de R$1\n", n1);
        }
    }
}