package edu.saxion;

public class Main {

    public static void main(String[] args) throws ExpressionFormatException{

        Menu menu = new Menu();
        menu.controlPanel();
        new Controller(menu.calculator, new Vision(), new Parser(menu.calculator.getOperators()),new Input()).run();

    }

}
