package edu.saxion;

public class Logarithm implements Operation {

    @Override
    public boolean isBinary() {
        return false;
    }

    @Override
    public String getOperator() {
        return "log";
    }

    @Override
    public String getDescription() {
        return "This option is logarithm";
    }

    @Override
    public double execute(double value)
    {
        return Math.log(value);
    }

    @Override
    public double execute(double val1, double val2) {
        throw new RuntimeException("Something went wrong. Try again!");
    }


}
