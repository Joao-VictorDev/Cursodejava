package Exercicios;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a Primeira Nota 1:");
        double nota1 = ler.nextDouble();

        System.out.println("Digite a Segunda Nota 2:");
        double nota2 = ler.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7){
            System.out.println("Aprovado");
        } else if (media < 7) {
            System.out.println("Reprovado");
        } else if (media == 10) {
            System.out.println("Aprovado com distinção");
        }
        ler.close();
    }
}
