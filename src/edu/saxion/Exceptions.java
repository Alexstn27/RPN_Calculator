package edu.saxion;

public class Exceptions {
    public static boolean isNumber(String token){
        try{
            double tokens = Double.parseDouble(token);
        }catch(NumberFormatException exception){
            return false;
        }
        return true;
    }
}
