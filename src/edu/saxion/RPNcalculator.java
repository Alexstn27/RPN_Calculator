package edu.saxion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RPNcalculator implements Calculator {

    private final ArrayList<Operation> operationsArrayList;
    public RPNcalculator() {
        this.operationsArrayList = new ArrayList<>();
    }

    public void addOperation(Operation operation){
        for (Operation operation1: operationsArrayList) {
            if (operation1.getOperator().equals(operation.getOperator()))
                return;
        }

        operationsArrayList.add(operation);

    }

    public double execute(List<String> statement){
        double value = Double.parseDouble(statement.get(0));
        statement.remove(0);

        while (!statement.isEmpty()){
            if (Parser.isNumber(statement.get(0))){
                double number = Double.parseDouble(statement.remove(0));
                String operator = statement.remove(0);
                for (Operation op : this.operationsArrayList) {
                    if (op.getOperator().equals(operator)) {
                        value = op.execute(value, number);
                    }
                }
            }else{
                String operator = statement.remove(0);
                for (Operation op : this.operationsArrayList) {
                    if (op.getOperator().equals(operator)) {
                        value = op.execute(value);
                    }
                }
            }
        }
        return value;
    }

    public List<String> getOperationsInfo() {
        return operationsArrayList
                .stream()
                .map(operation -> operation.getOperator() + " : " + operation.getDescription())
                .collect(Collectors.toList());
    }

    public List<String> getOperators(){
        return operationsArrayList
                .stream()
                .map(Operation::getOperator)
                .distinct()
                .collect(Collectors.toList());
    }

    }
