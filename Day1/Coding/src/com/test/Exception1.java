package com.test;

public class Exception1 {
	static void m1(){

        try
        {
            int a=4;
            int b=0;
            int c = a/b;
        }
        catch(ArithmeticException e)
        {
            throw new UnsupportedOperationException("unsupported number zero...please give valid number", e);

        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            m1();
        } catch (java.lang.Exception e) {
            // TODO Auto-generated catch block
          
            System.err.println(e);
        }
    }


}
