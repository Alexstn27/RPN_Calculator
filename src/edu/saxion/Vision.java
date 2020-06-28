package edu.saxion;

import java.util.List;

public class Vision {
    public void leads(List<String> operation){
        String message="Welcome to your RPN calculator !"+
                "Please enter one or two numbers."+
                "\nIf you want to close the program press q"+
                "\nYour possible operations : ";
        for (var possibleOperations : operation)
        {
            message += "\n";
            message += possibleOperations;
        }
        System.out.println(message);
    }

    public void badInputWarning()
    {
        System.out.println("The input is wrong. Please try again and be careful!");
    }

    public void printResult(double result)
    {
        System.out.println("The result is: " + result);
    }
}
