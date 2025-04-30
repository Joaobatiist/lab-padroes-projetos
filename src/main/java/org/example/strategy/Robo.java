package org.example.strategy;

public class Robo {
    private Comportamento Strategy;

    public void setStrategy(Comportamento strategy) {
        this.Strategy = strategy;
    }
    public void mover(){
        Strategy.mover();
    }
}
