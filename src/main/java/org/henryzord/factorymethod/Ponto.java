package org.henryzord.factorymethod;

public class Ponto {
    public float x;
    public float y;

    public Ponto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Ponto(" + x + ", " + y + ")";
    }
}
