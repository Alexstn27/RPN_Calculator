package edu.saxion;

public interface Operation {

    boolean isBinary();
    String getOperator();
    String getDescription();
    double execute(double val1, double val2);
    double execute(double val);
}
