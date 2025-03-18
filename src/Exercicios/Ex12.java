package Exercicios;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite Sua Altura");
        double altura = ler.nextDouble();

        double pesoIdeal = (72.7 * altura) - 58;
        System.out.println("O Peso Ideal e: " + pesoIdeal);
    }
}
