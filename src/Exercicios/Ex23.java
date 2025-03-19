package Exercicios;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite O Primeiro Numero");
        int num1 = ler.nextInt();

        System.out.println("Digite O Segundo Numero");
        int num2 = ler.nextInt();

        System.out.println("Digite O Terceiro Numero");
        int num3 = ler.nextInt();

        if (num1 <= num2 && num1 <= num3 && num2 <= num3){
            System.out.println(num3 + " - " + num2 + " - "+ num1);
        } else if (num1 <= num2 && num2 <= num3 && num3 <= num2) {
            System.out.println(num2 + " - " + num3 + " - "+ num1);
        } else if (num2 <= num1 && num2 <= num3 && num1 <= num3) {
            System.out.println(num3 + " - " + num1 + " - "+ num2);
        }
        ler.close();
    }
}
