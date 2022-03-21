package com.muwaffaq.innopolis.solid.LSP_IS.correct;

// liskov principle the parent and the child can be reliable
public class Duck implements Bird, Flyable, Swimable {

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

    @Override
    public void swim() {
        System.out.println("swimming");
    }
}
