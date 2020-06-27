package edu.saxion;


import java.util.List;

public interface Calculator {

    double execute(List<String> executeList);
    List<String > getOperationsInfo();
}
