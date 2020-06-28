package edu.saxion;

public class Subtraction implements Operation {

    @Override
    public boolean isBinary() {
        return true;
    }

    @Override
    public String getOperator() {
        return "-";
    }

    @Override
    public String getDescription() {
        return "This option is subtraction";
    }

    @Override
    public double execute(double val1, double val2) {
        return val1-val2;
    }
    @Override
    public double execute(double val) {
        throw new RuntimeException("Something went wrong. Try again!");
    }
}
