package Exercicios;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite 1 letra para verifica se vogal ou consoante");
        String letra = ler.next().toUpperCase();

        switch (letra){
            case "A","E","I","O","U":
                System.out.printf("Letra %s é Vogal",letra);
                break;
            default:
                System.out.printf("Letra %s é Consoante",letra);
        }
        ler.close();
    }
}
