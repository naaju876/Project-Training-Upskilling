package com.test;

public class single{
    static single st=new single();
    private single()
    {
        System.out.println("Constructor will invoke only one object");
    }
    static single getInstance()
    {
        return st;

    }
}
class Test
{
    public static void main(String args[])
    {
        single st1=single.getInstance();
        single st2=single.getInstance();
        System.out.println(st1);
        System.out.println(st2);
    }
}