package com.stackroute.p4;

import java.util.Arrays;

public class SortStrings {

    public static void main(String[] args)
    {
        String Result = sortWords("Slack is our common communication channel. It's very important for you all to be online all the time on slack. Kindly update your profile, Phone number, and if notification is snoozed then remove it immediate. Thanks!");

        System.out.println(Result);
    }

    public static String sortWords(String input)                        //method body
    {
        String Result = "";                                             //new string init
        String inputArr[] = input.split(" ");                      // split string into words
        Arrays.sort(inputArr,String.CASE_INSENSITIVE_ORDER);              //sorting of word in array

        for (String arr: inputArr)                                         //for each loop
        {
            Result = Result.concat(arr).concat(" ");                        //concat each word into result string

        }

        return Result.trim();                                               //trim and return resullt
    }
}
