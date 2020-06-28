package edu.saxion;

public class Sqrt implements Operation{


    @Override
    public boolean isBinary() {
        return false;
    }

    @Override
    public String getOperator() {
        return "sqrt";
    }

    @Override
    public String getDescription() {
        return "This option is square root of a number";
    }

    @Override
    public double execute(double value)
    {
        return Math.sqrt(value);
    }

    @Override
    public double execute(double val1, double val2) {
        throw new RuntimeException("Something went wrong. Try again!");
    }

}
