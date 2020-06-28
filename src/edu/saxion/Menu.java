package edu.saxion;

public class Menu {

    final RPNcalculator calculator = new RPNcalculator();

    public void controlPanel(){
        calculator.addOperation(new Addition());
        calculator.addOperation(new Subtraction());
        calculator.addOperation(new Division());
        calculator.addOperation(new Multiplication());
        calculator.addOperation(new Sqrt());
        calculator.addOperation(new Logarithm());

    }
}
