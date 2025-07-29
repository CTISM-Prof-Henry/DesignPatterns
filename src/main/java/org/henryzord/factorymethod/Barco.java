package org.henryzord.factorymethod;

public class Barco implements Veiculo {
    Pacote pacote;

    public Barco(Pacote pacote) {
        this.pacote = pacote;
    }

    @Override
    public Pacote entregaPacote(Ponto destino) {
        System.out.println("Entregando pacote de barco para " + destino);
        return this.pacote;
    }
}
