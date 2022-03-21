package com.muwaffaq.innopolis.solid.LSP_IS.correct;


public class Penguin implements Bird, Swimable {

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
        System.out.println("swim");
    }
}
