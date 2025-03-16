package Exercicios;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Entrer com valor hora");
        double valorHora = ler.nextDouble();

        System.out.println("Entrer com a quantidade de hora trabalhada no mes:");
        double hora = ler.nextDouble();

        double salario = valorHora * hora;
        System.out.println("O salario e de " + salario);
    }
}
