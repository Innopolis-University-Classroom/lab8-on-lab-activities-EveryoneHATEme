package com.muwaffaq.innopolis.solid.OCP_DI.correct;

import com.muwaffaq.innopolis.solid.OCP_DI.correct.operations.*;

import java.util.ArrayList;
import java.util.Arrays;


public class Calculator {
    private final double left;
    private final double right;

    Calculator(double left, double right) {
        this.left = left;
        this.right = right;
    }

    public double calculate(Operation operation) {
        return operation.calculate(left, right);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator(3434.674, 1488.228);
        ArrayList<Operation> operations = new ArrayList<>(Arrays.asList(new Add(), new Subtract(), new Multiply(), new Divide()));

        for (Operation operation : operations) {
            System.out.println(calculator.calculate(operation));
        }
    }

}
