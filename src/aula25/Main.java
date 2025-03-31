package aula25;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.marca = "Fiat";
        carro.modelo = "Ducato";
        carro.cor = "Azul";
        carro.numeroPassageiros = 10;
        carro.capacidadeCombustivel = 100;
        carro.consumoCombustivel = 0.2;

        carro.exibirAutonomia();
    }
}
