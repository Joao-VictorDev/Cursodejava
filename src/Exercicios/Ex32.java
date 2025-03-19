package Exercicios;

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o dia: ");
        int dia = scan.nextInt();
        System.out.println("Informe o mês: ");
        int mes = scan.nextInt();
        System.out.println("Informe o ano: ");
        int ano = scan.nextInt();

        if (dia > 31 || dia < 1) {
            System.out.println("Data inválida");
        } else if (mes < 1 || mes > 12) {
            System.out.println("Data inválida");
        } else if (ano < 0) {
            System.out.println("Data inválida");
        } else {
            System.out.println("Data válida");
        }

    }
}
