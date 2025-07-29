package org.henryzord.singleton;

import java.time.LocalDateTime;

import static java.lang.Thread.sleep;

public class Singleton {
    private static Singleton instance = null;
    public LocalDateTime time;

    public Singleton() {
        this.time = LocalDateTime.now();
    }

    public static Singleton getInstance() {
        if(Singleton.instance == null) {
            Singleton.instance = new Singleton();
        }
        return Singleton.instance;
    }

    public LocalDateTime getTime() {
        return this.time;
    }

    public static void main(String[] args) throws Exception {
        Singleton sing = Singleton.getInstance();

        System.out.println("Data de criação do singleton: " + Singleton.instance.getTime());

        System.out.println("Vou nanar por 5 segundos...");
        sleep(5000);
        System.out.println("Acordei!");
        System.out.println("Data de criação do singleton: " + Singleton.instance.getTime());
    }
}
