package Exercicios;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero inteiro");
        int num1 = ler.nextInt();
        System.out.println("Digite um numero inteiro");
        int num2 = ler.nextInt();

        int res = num1 + num2;

        System.out.println("A Soma é: " + res);
    }
}
