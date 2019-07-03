package com.stackroute.p4;

public class ReplaceString {
    public static void main(String[] args)
    {
        String Result = replaceGame("daily dry");           //method call

        System.out.println(Result);
    }

    public static String replaceGame(String input)                  //method body
    {
        String Result = input.replaceAll("d","f");      //replacement of d to f
        Result = Result.replaceAll("l","t");            //replacement of l to t

        return Result;                                                    //return result
    }
}
