package aula25;

public class Carro {
    String cor;
    String marca;
    String modelo;
    int numeroPassageiros;
    double capacidadeCombustivel = 100;
    double consumoCombustivel = 0.2;

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + capacidadeCombustivel * consumoCombustivel + "Km");
    }
}
