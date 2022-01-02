package sample;

public class NotSufficientCoinException extends Exception{
    public String getMessage(){
        return "Not Sufficient Coins";
    }
}
