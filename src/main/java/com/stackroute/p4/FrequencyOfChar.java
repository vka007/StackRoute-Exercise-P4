package com.stackroute.p4;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String");         //take input string
        String input = scanner.nextLine();

        System.out.println("Enter the character to be found");      //take character to be found
        char c = scanner.next().charAt(0);

        String charCount = charFreq(input,c);                       //method call and find freq
        System.out.println("Occurrence Of Char In String: " + charCount);

    }

    public static String charFreq(String input,char c)                  //method body
    {
        input = input.toLowerCase();                                   //convert to lower case all chars

        if(!Character.isLetter(c))                                     //is a letter check
            return "Invalid input, Enter a valid char";

        c = Character.toLowerCase(c);                                   //convert to lowercase

        int charCount = input.length() - input.replaceAll(c+"", "").length(); //calculate freq

        return charCount+"";                                                //return the freq
    }
}
