package edu.saxion;

public class Addition implements Operation {
    @Override
    public boolean isBinary() {
        return true;
    }

    @Override
    public String getOperator() {
        return "+";
    }

    @Override
    public String getDescription() {
        return "This option is addition";
    }

    @Override
    public double execute(double val1, double val2) {
        return val1+val2;
    }

    @Override
    public double execute(double val) throws RuntimeException {
        throw new RuntimeException("Something went wrong. Try again!");
    }
//    private final Operation one;
//    private final Operation two;
//
//    public Addition(Operation operationOne, Operation operationTwo){
//        this.one= operationOne;
//        this.two= operationTwo;
//    }
//
//    public static Addition of(Operation operationOne, Operation operationTwo){
//        return new Addition(operationOne, operationTwo);
//    }
//
//    @Override
//    public boolean isBinary() {
//        return true;
//    }
//
//    @Override
//    public String getOperator() {
//        return "+";
//    }
//
//    @Override
//    public String getDescription() {
//        return one + getOperator() + two;
//    }
//
//    @Override
//    public double execute(double val) {
//        return val;
//    }
//
//    @Override
//    public double execute(double val1, double val2) {
//        return val1 + val2;
//    }
}
