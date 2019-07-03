package com.stackroute.p4;

public class FindHarry {
    public static void main(String[] args)
    {
        boolean bool = isHarryhere("Hi I am Harry");    //function call
        System.out.println(bool);                             //print and check output
    }

    public static boolean isHarryhere(String input)            //method
    {
        boolean bool = false;                               //Initialize a bool variable

        if(input.contains("Harry"))                         //check is Harry is present
            return true;
        else
            return false;                                   //return the result
    }
}
