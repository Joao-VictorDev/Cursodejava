package Exercicios;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o Primeiro Numero:");
        int num1 = ler.nextInt();

        System.out.println("Digite o Segundo Numero:");
        int num2 = ler.nextInt();

        System.out.println("Digite o Terceiro Numero:");
        int num3 = ler.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.printf("%s Maior de Todos \n", num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.printf("%s Maior de Todos \n", num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.printf("%s Maior de Todos \n", num3);
        }else {
            System.out.println("Você digitou Numero igual");
        }


        if (num1 < num2 && num1 < num3) {
            System.out.printf("%s Menor de Todos", num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.printf("%s Menor de Todos", num2);
        } else if (num3 < num1 && num3 < num2) {
            System.out.printf("%s Menor de Todos", num3);
        }else {
            System.out.println("Você digitou Numero igual");
        }
        ler.close();
    }
}
