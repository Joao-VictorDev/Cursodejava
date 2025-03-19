package aula16;

public class Main {
    public static void main(String[] args) {

        int i = 0;

        System.out.println("While");
        while (i < 11){
            System.out.print(i);
            i++;
        }

        do {
            i++;
            System.out.println("\nValor de do while: " + i);
        }while (i < 11);
    }
}
