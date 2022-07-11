package com.sample;

public class Car {
    private Engine engine;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void print() {
        System.out.println(engine.name);
    }
}
