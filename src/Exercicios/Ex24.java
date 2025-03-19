package Exercicios;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Que Turno Você Estudada: M - matutino V - Vespertino N - Noturno");
        String letra = ler.next().toUpperCase();

        switch (letra){
            case "M":
                System.out.println("Bom Dia");
                break;
            case "V":
                System.out.println("Boa Tarde");
                break;
            case "N":
                System.out.println("Boa Noite");
            default:
                System.out.printf("Valor invalido");
        }

        ler.close();
    }
}
