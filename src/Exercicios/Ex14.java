package Exercicios;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Entre com o tamanho do arquivo");
        double tamArquivo = ler.nextDouble();

        System.out.println("Entre com a velocidade da internet");
        double velInternet = ler.nextDouble();

        double tempo = tamArquivo / velInternet;

        System.out.println("Tempo de download: " + tempo);
    }
}