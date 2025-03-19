package Exercicios;

import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o ano: ");
        int ano = scan.nextInt();

        if (ano % 4 == 0) {
            System.out.println("Ano bissexto");
        } else {
            System.out.println("Ano não bissexto");
        }

        scan.close();
    }
}