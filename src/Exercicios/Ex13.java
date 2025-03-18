package Exercicios;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Entrer com valor hora");
        double valorHora = ler.nextDouble();

        System.out.println("Entrer com a quantidade de hora trabalhada no mes:");
        double hora = ler.nextDouble();

        double salarioBruto = valorHora * hora;
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double ir = (salarioBruto / 100) * 11;
        double totalDesconto  = inss + sindicato + ir;

        System.out.println("O salario Bruto: " + salarioBruto);
        System.out.println("O Total de Descontos: " + totalDesconto);
    }
}


