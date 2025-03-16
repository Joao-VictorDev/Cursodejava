package aula12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual seu nome");
        String nome = ler.nextLine();

        System.out.println(nome + " Qual sua idade");
        int idade = ler.nextInt();

        System.out.println(nome + " tem " + idade + " anos");

        System.out.println("1 para sim ou 2 para não");
        int res = ler.nextInt();

        System.out.println();
        ler.close();
    }
}
