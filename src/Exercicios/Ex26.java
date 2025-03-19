package Exercicios;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Entrer com valor hora");
        double valorHora = ler.nextDouble();

        System.out.println("Entrer com a quantidade de hora trabalhada no mês:");
        double qtdhora = ler.nextDouble();

        double salarioBruto = valorHora * qtdhora;
        int percentualIR = 0;

        if (salarioBruto <= 900){
            percentualIR = 0;
        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
            percentualIR = 5;
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            percentualIR = 10;
        } else if (salarioBruto > 2500) {
            percentualIR = 20;
        }

        double ir = (salarioBruto / 100) * percentualIR;
        double inss = (salarioBruto / 100) * 10;
        double fgts = (salarioBruto / 100) * 11;
        double totalDesconto = ir + inss;
        double salarioLiquido = salarioBruto - totalDesconto;

        System.out.println("Salario Bruto: (" + valorHora + "*" + qtdhora + "): " + salarioBruto);
        System.out.println("(-) IR (" + percentualIR + "%): " + ir);
        System.out.println("(-) INSS (10%) : " + inss);
        System.out.println("FGTS (11%): "  + fgts);
        System.out.println("Total de descontos: " + totalDesconto);
        System.out.println("Salario Liquido" + salarioLiquido);

        ler.close();
    }
}


