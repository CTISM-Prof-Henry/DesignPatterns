package org.henryzord.factorymethod;

public class Main {
    public static void main(String[] args) {
        FabricaDeVeiculos fabrica = new FabricaDeVeiculos();

        Veiculo veiculo = fabrica.criaVeiculo("mar", new Pacote("João", new Ponto(10, 20)));

        veiculo.entregaPacote(new Ponto(30, 40));
    }
}
