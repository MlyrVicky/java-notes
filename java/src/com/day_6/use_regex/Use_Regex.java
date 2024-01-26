package com.day_6.use_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Use_Regex {

    public static void main(String[] args) {
        /// patten matching using regular expression.

         String patten ="[aA0-zZ9]{4,}@[a-z]{5,7}.[a-z]{2,3}";

         String input = "vitvicky348@gmail.com  kbbuqabua Ramesh@gmail.com";


       Pattern regex = Pattern.compile(patten);

        Matcher matcher = regex.matcher(input);

       // System.out.println(matcher.find()); --> is checking the email is correct or not
       // output: is true or false

        while(matcher.find()){
            String foundString = matcher.group();
            System.out.println(foundString);
        }


    }
}
