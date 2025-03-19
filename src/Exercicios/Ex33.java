package Exercicios;

import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número positivo: ");
        int num = scan.nextInt();

        int unidade = num % 10;
        num = (num - unidade) / 10;
        int dezena = num % 10;
        num = (num - dezena) / 10;
        int centena = num;

        System.out.println("centena(s): " + centena);
        System.out.println("dezena(s): " + dezena);
        System.out.println("unidade(s): " + unidade);

    }
}
