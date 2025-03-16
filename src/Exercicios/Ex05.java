package Exercicios;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor em metros");
        double metros = ler.nextDouble();

        double cm = metros * 100;
        System.out.println(metros + "m é igual a " + cm + "cm");
    }
}
