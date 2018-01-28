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

    public Gender getGender(String nin) {
        char z=nin.charAt(2);
        if(nin.charAt(6)=='/' && (nin.length()!=11 && nin.length()!=10))
            return Gender.Transformer;
        if(nin.charAt(6)!='/' && (nin.length()!=10 && nin.length()!=9))
            return Gender.Transformer;
        if(z=='0'|| z=='1')
            return Gender.Male;
        else if(z=='5'|| z=='6')
            return Gender.Female;
        else
            return Gender.Transformer;
    }



}
