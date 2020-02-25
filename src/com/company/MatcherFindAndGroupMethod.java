package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherFindAndGroupMethod {


        public static void main(String[] args) {
            StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
            htmlText.append("<h2>Sub-heading</h2>");
            htmlText.append("<p>This is a paragraph about something.</p>");
            htmlText.append("<p>This is another paragraph about something else.</p>");
            htmlText.append("<h2>Summary</h2>");
            htmlText.append("<p>Here is the summary.</p>");

            //greedy quantifier and lazy quantifier (?)
            String groupPattern = "(<h2>.*?</h2>)";
            Pattern pattern = Pattern.compile(groupPattern);
            Matcher matcher = pattern.matcher(htmlText);
            while (matcher.find()) {
                System.out.println("Occurences: " + matcher.group(0)  );
            }

            //if you want only the data between the tags
            String groupPattern1 = "(<h2>)(.*?)(</h2>)";
            Pattern pattern1 = Pattern.compile(groupPattern1);
            Matcher matcher1 = pattern1.matcher(htmlText);
            while (matcher1.find()) {
                System.out.println("Occurences: " + matcher1.group(2)  );
            }


        }

}
