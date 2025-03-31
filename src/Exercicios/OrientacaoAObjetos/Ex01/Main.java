package Exercicios.OrientacaoAObjetos.Ex01;

public class Main {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        System.out.println("Nome :" + lampada.nome);
        System.out.println("Cor: " + lampada.cor);
        System.out.println("Kit: "+lampada.Kit);
        System.out.println("Marca: "+lampada.marca);
        System.out.println("QuantoConsome: "+lampada.quantoConsome);
        System.out.println("Tensao: "+lampada.tensao);
        System.out.printf("Valor R$ %.2f Reais",lampada.valor);
    }
}
