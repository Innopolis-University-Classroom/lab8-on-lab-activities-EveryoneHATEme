package com.muwaffaq.innopolis.solid.LSP_IS.correct;

// liskov principle the parent and the child can be reliable
public class Pigeon implements Bird, Flyable {
    
    @Override
    public void fly() {
        System.out.println("Flying...");
    }

    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void hatch() {
        System.out.println("laying eggs");
    }
}
