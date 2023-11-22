package com.test;

public class Arithmeticexception {
    public static void main(String[] args)
    {
        int num1 = 6, num2 = 6, results;
        try
        {
            results = num1 / num2;
            System.out.println("the result id: " + results);
        }
        catch (ArithmeticException e)
        {
            System.out.println("can't be divided by zero"+e);
        }
    }
}