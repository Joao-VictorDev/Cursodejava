package Exercicios;

import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Entrer com o dia da semana");
        int diaSemana = ler.nextInt();

        switch (diaSemana){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda Feira");
                break;
            case 3:
                System.out.println("Terce Feira");
                break;
            case 4:
                System.out.println("Quarta Feira");
                break;
            case 5:
                System.out.println("Quinta Feira");
                break;
            case 6:
                System.out.println("Sexta Feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Dia invalido...");
        }
        ler.close();
    }
}
