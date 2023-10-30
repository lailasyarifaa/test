package Modul3dua;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validation {
    private boolean Freturn = false;

    public validation(String argWord){
        if (this.isPassLowerCase(argWord)&&this.isPassSymbol(argWord)&&this.isPassDigit(argWord)&&this.isPassUperCase(argWord)) {
            this.Freturn = true;
        }
    }
    public boolean isPassSymbol(String argWord) {
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9\\s]+");
        Matcher matcher = pattern.matcher(argWord);
        String varFind = "";
        while (matcher.find()) {
            varFind = matcher.group();
        }
        return (varFind.length()>0)?  true :  false ;
    }
    public boolean isPassDigit(String argWord){
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(argWord);
        String varFind = "";
        while (matcher.find()) {
            varFind = matcher.group();
        }
        return (varFind.length()>0)?  true :  false ;
    }
    public boolean isPassLowerCase(String argWord){
        Pattern pattern = Pattern.compile("[a-z]+");
        Matcher matcher = pattern.matcher(argWord);
        String varFind = "";
        while (matcher.find()) {
            varFind = matcher.group();
        }
        return (varFind.length()>0)?  true :  false ;
    }
    public boolean isPassUperCase(String argWord){
        Pattern pattern = Pattern.compile("[A-Z]+");
        Matcher matcher = pattern.matcher(argWord);
        String varFind = "";
        while (matcher.find()) {
            varFind = matcher.group();
        }
        return (varFind.length()>0)?  true :  false ;
    }
    public boolean getFreturn() {
        return this.Freturn;
    }
}
