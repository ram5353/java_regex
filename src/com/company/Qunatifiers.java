package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Qunatifiers {
    public static void main(String[] args) {
        String secondString = "abcDeeeF12GhhabcDeeeiiiijkl99z";
        System.out.println(secondString.replaceAll("^abcDe{3}","X")); //exact 3 e's
        System.out.println(secondString.replaceAll("^abcDe+","X"));  //one or more e's
        System.out.println(secondString.replaceAll("abcDe*","X"));   //zero or more e's
        System.out.println(secondString.replaceAll("abcDe{2,5}","X"));

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something.</p>");
        htmlText.append("<p>This is another paragraph about something else.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary.</p>");

        String h2Pattern = ".*<h2>.*";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());
    }
}
