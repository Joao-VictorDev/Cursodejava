package aula14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual sua idade");
        int idade = ler.nextInt();

        if (idade >= 18){
            System.out.println("Você e maior de Idade");
        }else {
            System.out.println("Você e menor de Idade");
        }

        System.out.println("Digite o valor do Produto");
        int valor = ler.nextInt();

        if (valor <= 10){
            System.out.println("Barato Pode Comprar");
        }else if (valor < 10 && valor < 15){
            System.out.println("Você Pode Pedir desconto");
        }else if (valor >= 15 && valor < 17){
            System.out.println("Você Pode Pequisar mais");
        }else {
            System.out.println("Muito caro");
        }
    }
}
