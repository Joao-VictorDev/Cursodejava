package aula19;

public class Main {
    public static void main(String[] args) {
        double tempAno[] = new double[365];
        tempAno[0] = 31.5;
        tempAno[1] = 31.3;
        tempAno[2] = 30.6;

        System.out.println("Tamanho do Array: " + tempAno.length);
        System.out.println("Valores do Array: " + tempAno[0]);

        for (int i = 0; i < tempAno.length;i++){
            System.out.println("Temperatura Dia: " + (i + 1) + " é " + tempAno[i]);
        }
    }
}
