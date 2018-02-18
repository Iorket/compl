package com.pars;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    private String progText;
    private ArrayList<Variable> variables;
    private int charIndex;
    private String ErrorText;

    public Parser() {


    }

    public String getErrorMessage() {
        return ErrorText;
    }

    private void addError(String error) {
        ErrorText = ErrorText + error + "\n";
    }

    private void keyWord(int charIndex) {
        String keyWord = "";
        if (charIndex == 0 && progText.length() > 0) {
            //добавить find regex
            if (getKeyWord(0) == "begin")
                keyWord(charIndex);
            else addError("Ожидалось begin");

        }

        //проверка на служебные слова
        switch (getKeyWord(charIndex)) {
            case ("var"):
                varKey(charIndex);
            case ("if"):
                ifKey(charIndex);
            case ("for"):
                loopKey(charIndex);
            case ("while"):
                loopKey(charIndex);
        }
    }

    private String getKeyWord(int charIndex) {
        String keyWord = "";
        boolean charOnly = true;
        while (charOnly) {
            char progChar = progText.charAt(charIndex);
            if (Character.isLetter(progChar)) {
                keyWord += progChar;
            } else charOnly = false;
            charIndex++;
        }
        return keyWord;
    }
    public void startPars(String progText){
        this.progText=progText;
        commentsDeleting();
        this.charIndex=0;
        wspaceDeleteng();
        keyWord(charIndex);

    }
    private void varKey(int charIndex){
    }
    private void ifKey(int charIndex){

    }
    private void loopKey(int charInder)
    {

    }
    private void CommentKey(int charIndex){
        int secondCommIndex = progText.indexOf("*)",charIndex);
        if(secondCommIndex==-1) addError("*) not found");
        keyWord(secondCommIndex+2);
    };

    /*удалить к х*/
    private void commentsDeleting(){
        String delString;
        int secondCommIndex,firstCommIndex;
        do {
            firstCommIndex = progText.indexOf("(*");
            secondCommIndex = progText.indexOf("*)");
            delString=progText.substring(firstCommIndex,secondCommIndex);
            progText=progText.replace(delString,"");
        }
        while (firstCommIndex!=secondCommIndex);

    }

    private void wspaceDeleteng(){
        progText.replaceAll("\\s+", " ");
    }
    public String getProgText(){
        return progText;
    }
}
