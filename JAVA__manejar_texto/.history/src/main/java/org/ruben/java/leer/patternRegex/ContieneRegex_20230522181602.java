package org.ruben.java.leer.patternRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContieneRegex {
    

    public static void main(String[] args)
    {
        final String REGEX = ".*www.*";
        String texto = "www.geeksforgeeks.org";
 
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(texto);
 
        // check whether Regex string is
        // found in actualString or not
        boolean matches = matcher.matches();
 
        System.out.println("actualString "
                           + "contains REGEX = "
                           + matches);
    }


}