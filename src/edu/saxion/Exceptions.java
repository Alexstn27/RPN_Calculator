package edu.saxion;

public class Exceptions {
    public static boolean isNumber(String token){
        try{
            double tokens = Double.valueOf(token);
        }catch(NumberFormatException exception){
            return false;
        }
        return true;
    }
}
