package aula15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero de 1 a 7");
        int diaSemana = ler.nextInt();

        switch (diaSemana){
            case 1:
                System.out.println("domigo");
                break;
            case 2:
                System.out.println("Segunda Feira");
                break;
            case 3:
                System.out.println("Terça Feira");
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
                System.out.println("Dia da Senama Invalido");

        }
        ler.close();
    }
}
