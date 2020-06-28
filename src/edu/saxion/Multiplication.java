package edu.saxion;

public class Multiplication implements Operation {

    @Override
    public boolean isBinary() {
        return true;
    }

    @Override
    public String getOperator() {
        return "*";
    }

    @Override
    public String getDescription() {
        return "This option is multiplication";
    }

    @Override
    public double execute(double val1, double val) {
        return val1 * val;
    }

    @Override
    public double execute(double val) throws RuntimeException {
        throw new RuntimeException("Something went wrong. Try again!");
    }
}
