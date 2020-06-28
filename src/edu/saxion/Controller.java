package edu.saxion;

import java.util.ArrayList;

public class Controller {

    private Calculator calculator;
    private Vision vision;
    private Parser parser;
    private Input input;

    public Controller(Calculator calculator, Vision vision, Parser parser, Input input) {
        this.calculator = calculator;
        this.vision = vision;
        this.parser = parser;
        this.input = input;
    }

    public void run()
    {
        while (true)
        {
            vision.leads(calculator.getOperationsInfo());
            String takeInput = input.getInput();
            if (takeInput.toLowerCase().equals("q"))
                return;
            if (parser.canParse(takeInput))
            {
                ArrayList<String> parsed = parser.parse(takeInput);
                double result = calculator.execute(parsed);
                vision.printResult(result);
            }
            else
            {
                vision.badInputWarning();
            }
        }
    }

}
