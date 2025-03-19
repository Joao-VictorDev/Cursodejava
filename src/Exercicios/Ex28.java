package Exercicios;

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a Primeira nota");
        double nota1 = ler.nextDouble();

        System.out.println("Digite a Segunda nota");
        double nota2 = ler.nextDouble();

        double media = (nota1 + nota2) / 2;

        String aproveitamento = "";

        if (media >= 9 && media <= 10){
            aproveitamento = "A";
        } else if (media >= 7.5 && media < 9) {
            aproveitamento = "B";
        }else if (media >= 6 && media <= 7.5){
            aproveitamento = "C";
        } else if (media >= 4 && media <= 6) {
            aproveitamento = "D";
        } else if (media >= 0 && media <= 4) {
            aproveitamento = "E";
        }

        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Conceito: " + aproveitamento);
        System.out.println("Media:" + media);

        switch (aproveitamento){
            case "A":
            case "B":
            case "C":
                System.out.println("Aprovado");
                break;
            case "D":
            case "E":
                System.out.println("Reprovado");
                break;
        }
        ler.close();
    }
}
