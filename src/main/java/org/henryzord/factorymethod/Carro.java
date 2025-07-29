package org.henryzord.factorymethod;

public class Carro implements Veiculo {
    Pacote pacote;

    public Carro(Pacote pacote) {
        this.pacote = pacote;
    }

    public Pacote entregaPacote(Ponto destino) {
        System.out.println("Entregando pacote de barco para " + destino);
        return this.pacote;
    }
}
