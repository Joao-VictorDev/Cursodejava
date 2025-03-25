package Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double[] vetorA = new double[15];
        double[] vetorB = new double[vetorA.length];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Entrer com o valor da posição: " + i);
            vetorA[i] = ler.nextInt();
            vetorB[i] = Math.sqrt(vetorA[i]);
        }

        System.out.println("---Vetor A-----" );
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + "");
        }

        System.out.println();
        DecimalFormat df = new DecimalFormat("###,###.###");

        System.out.println("---Vetor B-----" );
        for (int i = 0; i < vetorB.length; i++){
            System.out.print(df.format(vetorB[i]) + "");
        }
    }
}
