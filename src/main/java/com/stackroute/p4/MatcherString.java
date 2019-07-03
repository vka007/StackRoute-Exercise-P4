package com.stackroute.p4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherString {
    public  static  void  main(String[] args)
    {
        String Result = matchTheString("Hii thiis is a hii mess is","is");      //method call

        System.out.println(Result);


    }

    public static String matchTheString(String input,String word)
    {
        String Result="";                                               //result null string init

        Pattern pattern = Pattern.compile(word);                        //pattern compile here
        Matcher matcher = pattern.matcher(input);                       //input string matching

        int count = 0;
        while(matcher.find()) {                                         //a loop to find the occurance and index of occurance
            count++;
            Result = Result.concat("found: " + count + " : "
                    + matcher.start() + " - " + matcher.end()+"\n");
        }

        return Result;                                                  //return result
    }
}
