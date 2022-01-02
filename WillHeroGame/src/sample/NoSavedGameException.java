package sample;

public class NoSavedGameException extends Exception{
    public String getMessage(){
        return "No saved game to show";
    }
}
