package Exercicios;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Entrer Com o primeiro numero: ");
        int num1 = ler.nextInt();

        System.out.println("Entrer Com o Segundo Numero: ");
        int num2 = ler.nextInt();

        if (num1 > num2){
            System.out.printf("O %d e maior quer %d",num1,num2);
        }else {
            System.out.printf("O %d e maior quer %d",num2,num1);
        }
        ler.close();
    }
}
