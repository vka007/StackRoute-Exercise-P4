package com.stackroute.p4;

public class TransposeString {

    public static void main(String[] args)
    {
        String Result = transposeWord("Slack is our 3 of 4r common communication channel");

        System.out.println(Result);
    }

    public static String transposeWord(String input)                    //method body
    {
        String Result="";                                               //new string init

        String[] inputArr = input.split(" ");                      //split the string into word array
        String reverse = "";

        for (String arr : inputArr)                                      //for each loop
        {
            for (int i= arr.length()-1;i>=0;i--)                         //loop to make the string reverse
            {
                reverse = reverse + arr.charAt(i);
            }
            Result = Result.concat(reverse).concat(" ");                   //concat reverse string into result
            reverse = "";                                                   //reinitialise string to null
        }

        return Result.trim();                                               //return the result
    }
}
