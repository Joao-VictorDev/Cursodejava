package Exercicios;

import java.util.Scanner;

public class Ex45 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Entrer com o valor do VetorA da posição: " + i);
            vetorA[i] = ler.nextInt();
        }
        for (int i = 0; i < vetorB.length; i++){
            System.out.println("Entrer com o valor do VetorB da posição: " + i);
            vetorA[i] = ler.nextInt();
        }
        for (int i = 0; i < vetorC.length; i++){
            vetorC[i] = vetorA[i] * vetorB[i];
        }

        System.out.println("---Vetor A-----" );

        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + "");
        }

        System.out.println();

        System.out.println("---Vetor B-----" );

        for (int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + "");
        }

        System.out.println();

        System.out.println("---Vetor C-----" );

        for (int i = 0; i < vetorC.length; i++){
            System.out.print(vetorC[i] + "");
        }

    }
}
