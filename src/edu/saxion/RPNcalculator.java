package edu.saxion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RPNcalculator implements Calculator {

    private ArrayList<Operation> operationsArrayList;
    public RPNcalculator() {
        this.operationsArrayList = new ArrayList<>();
    }

    public boolean addOperation(Operation operation){
        for (Operation operation1: operationsArrayList) {
            if (operation1.getOperator().equals(operation.getOperator()))
                return false;
        }

        operationsArrayList.add(operation);

        return true;
    }

    public double execute(List<String> expression){
        
    }

    public List<String> getOperationsInfo() {
        return operationsArrayList
                .stream()
                .map(operation -> operation.getOperator() + " - " + operation.getDescription())
                .collect(Collectors.toList());
    }

    public List<String> getOperators(){
        return operationsArrayList
                .stream()
                .map(op -> op.getOperator())
                .distinct()
                .collect(Collectors.toList());
    }

    }
