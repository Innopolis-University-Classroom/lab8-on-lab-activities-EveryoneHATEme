package com.muwaffaq.innopolis.solid.OCP_DI.correct.operations;

public class Multiply implements Operation {

    public double calculate(double left, double right) {
        return left * right;
    }
}
