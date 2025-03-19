package aula18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Entrer com um numero");
        int num = ler.nextInt();

        System.out.println("Entrer com um limite");
        int max = ler.nextInt();

        for (int i = num; i < max; i++){
            if (i % 7 == 0){
                System.out.println("Valor de i: " + i);
                break;
            }
        }
    }
}
