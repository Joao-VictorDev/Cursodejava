package Exercicios;

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu salario atual");
        double salario = ler.nextDouble();

        int percentual = 0;
        if (salario <= 280){
            percentual = 20;
        } else if (salario > 280 && salario <= 700) {
            percentual = 15;
        }else if (salario > 700 && salario <= 1500){
            percentual = 10;
        }else if (salario >= 1500){
            percentual = 5;
        }
        double aumento = (salario / 100) * percentual;
        double salarioAjustado = salario + aumento;

        System.out.println("Salario: " + salario);
        System.out.println("Pecentual: " + percentual);
        System.out.println("Aumento: " + aumento);
        System.out.println("salario Ajustado: " + salarioAjustado);


    }
}
