package com.company;

public class Plus extends Operation {
    @Override
    public double execute(double a, double b) {
        double res = a + b;
        return res;
    }
}
