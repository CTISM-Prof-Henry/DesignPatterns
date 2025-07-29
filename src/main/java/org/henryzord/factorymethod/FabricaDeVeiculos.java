package org.henryzord.factorymethod;

public class FabricaDeVeiculos {
    public Veiculo criaVeiculo(String rota, Pacote pacote) {
        if (rota.equals("mar")) {
            return new Barco(pacote);
        } else if (rota.equals("terra")) {
            return new Carro(pacote);
        }
        return null;
    }
}
