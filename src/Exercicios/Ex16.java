package Exercicios;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Entrer Com o primeiro numero: ");
        int num1 = ler.nextInt();

        if (num1 >= 0){
            System.out.printf("O %d e positivo",num1);
        }else if (num1 < 0){
            System.out.printf("O %d e negativo",num1);
        }
        ler.close();
    }
}
