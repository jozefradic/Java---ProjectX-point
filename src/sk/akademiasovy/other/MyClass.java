package sk.akademiasovy.other;

import javax.swing.text.AttributeSet;

public class MyClass {
    public String formatName ( String name )
    {
        String firstLetter = name.substring(0,1).toUpperCase();
        String restLetters = name.substring(1).toLowerCase();
        return firstLetter + restLetters;
    }

    public boolean isEmailValid(String email) {
        if(!email.contains("@"))
            return false;
        if(email.length()<5)
            return false;
        int i;
        int wrongCharacters=0;
        int countOfAt=0;
        for(i=0;i<email.length();i++){
            Character z=email.charAt(i);
            if (Character.isAlphabetic(z)|| Character.isDigit(z) || "-@._".contains(z.toString())) {

                if(z.charValue()=='@')
                    countOfAt++;
                if(countOfAt==2){
                    return false;
                }
                //znak je platny
            }
            else{
                return false;
            }
        }

        return true;
    }

}
