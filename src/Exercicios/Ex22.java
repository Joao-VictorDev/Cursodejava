package Exercicios;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o Valor do Produto 1:");
        double produto1 = ler.nextDouble();

        System.out.println("Digite o Valor do Produto 2:");
        double produto2 = ler.nextDouble();

        System.out.println("Digite o Valor do Produto 3:");
        double produto3 = ler.nextDouble();

        if (produto1 < produto2 && produto1 < produto3) {
            System.out.printf("R$ %.2f - Você deve comprar esse produto, pois está mais barato.%n", produto1);
        } else if (produto2 < produto1 && produto2 < produto3) {
            System.out.printf("R$ %.2f - Você deve comprar esse produto, pois está mais barato.%n", produto2);
        } else if (produto3 < produto1 && produto3 < produto2) {
            System.out.printf("R$ %.2f - Você deve comprar esse produto, pois está mais barato.%n", produto3);
        } else {
            System.out.println("Há dois ou mais produtos com o mesmo preço mais barato.");
        }

        ler.close();
    }
}
