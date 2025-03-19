package Exercicios;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu Sexo F ou M");
        String sexo = ler.next().toUpperCase();

        switch (sexo){
            case "F":
                System.out.println("F - Feminino");
                break;
            case "M":
                System.out.println("M - Masculino");
                break;
            default:
                System.out.println("Sexo inválido");
        }
        ler.close();
    }
}
