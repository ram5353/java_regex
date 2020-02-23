package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String string = "Check the regular expression";
        System.out.println(string);

        //replaceAl() method
        String yourString = string.replaceAll("Check", "Observe");
        System.out.println(yourString);

        //only checks at the starting of the string
        String secondString = "abcDeeeF12GhhabcDeeeiiiijkl99z";
        String newString = secondString.replaceAll("^abcDee","YYY");
        System.out.println(newString);


        //matches complete string should be matched, then only it return true
        Pattern pattern = Pattern.compile("^abcDee");
        Matcher matcher = pattern.matcher(secondString);
        System.out.println(matcher.matches());

        //$ end character
        System.out.println(secondString.replaceAll("ijkl99z$", "THE END"));

        //replace occurences of a,e,i with letter "X"
        System.out.println(secondString.replaceAll("[aei]","X"));

        //replace a,e,i only if they are followed by F,j
        System.out.println(secondString.replaceAll("[aei][Fj]","X"));


        System.out.println("Hello world");


    }
}
