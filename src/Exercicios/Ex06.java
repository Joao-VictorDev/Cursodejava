package Exercicios;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor raio do circulo");
        double raio = ler.nextDouble();

        double area = Math.PI * Math.pow(raio,2);
        System.out.println("Valor do círculo é: " + area);
    }
}
