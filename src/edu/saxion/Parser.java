package edu.saxion;

import java.util.ArrayList;
import java.util.List;


public class Parser {
    final List<String> suppOperators;

    public Parser(List<String> suppOperators){
        this.suppOperators=suppOperators;
    }

    public ArrayList<String> parse (String equation) {
        ArrayList<String> container = new ArrayList<>();
        String [] splitter = equation.split(" ");

        for(var split:splitter){
            try {
                if (!isSupportedOperators(split) && !isInteger(split))
                    throw  new ExpressionFormatException("Incorrect arguments");
                else container.add(split);
            }catch (ExpressionFormatException efe){
                System.out.println(efe.getMessage());
            }
        }

        return container;
    }

    public boolean canParse(String equation)
    {
        String[] stringArray = equation.split("\\s+");
        if ((stringArray.length != 2 && stringArray.length != 3) )
            return false;
//        if ( equation.length()==7)
//            return false;
        for (var i = 0; i < stringArray.length; i++)
        {
            if (i == stringArray.length - 1)
            {
                if (Exceptions.isNumber(stringArray[i]))
                    return false;
                if (!suppOperators.contains(stringArray[i]))
                    return false;
            }
            else if (!Exceptions.isNumber(stringArray[i]))
                return false;
        }
        return  true;
    }

    private boolean isInteger(String splited){
        String replaced= splited.replaceAll("\\D","");
        return !replaced.equals("");
    }

    private boolean isSupportedOperators(String splited){
        return suppOperators.contains(splited);
    }

    public static boolean isNumber(String token){
        try{
            double number = Double.parseDouble(token);
        }catch(NumberFormatException ex){
            return false;
        }
        return true;
    }
}
