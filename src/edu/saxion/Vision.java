package edu.saxion;

import java.util.List;

public class Vision {
    public void leads(List<String> operation){
        StringBuilder message= new StringBuilder("Welcome to your RPN calculator !" +
                "Please enter one or two numbers." +
                "\nIf you want to close the program press q" +
                "\nYour possible operations : ");
        for (var possibleOperations : operation)
        {
            message.append("\n");
            message.append(possibleOperations);
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
