package edu.saxion;

import java.util.List;

public class Controller {

    private final Calculator calculator;
    private final Vision vision;
    private final Parser parser;
    private final Input input;

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
                List<String> parsed = parser.parse(takeInput);
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
