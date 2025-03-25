package aula21;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] notas = new int[10];

        Random random = new Random();

        for (int i = 0; i < notas.length;i++){
            notas[i] = random.nextInt(1,100);
        }

        for (int i : notas){
            System.out.print(i + " ");
        }
    }
}
