package com.test;

import java.util.TreeMap;

public class Collection1 {
    public static void main(String[] args)
    {
        TreeMap<Long , String> map = new TreeMap<Long, String>();
        TreeMap<Long , String> Name = new TreeMap<Long, String>();
        TreeMap<Long , String> email = new TreeMap<Long, String>();
        TreeMap<Long , Enum> Gender = new TreeMap<Long, Enum>();

        map.put(9370330128L, "Sanket");
        map.put(9576345689L, "Rohan");
        map.put(9576342378L, "naaju");
        map.put(9576341298L, "ayush");

        System.out.println("The keys of the given treemap is" + map.keySet());
        System.out.println("The values of the given treemap is" + map.values());
        System.out.println("The key/value pair is " + map.entrySet());

        Name.put(9245567889L, "Naaju");
        Name.put(9345567889L, "Sonu");
        Name.put(9645567889L, "Tanu");
        Name.put(9145567889L, "Sware");
        Name.put(9346567889L, "pintu");
        Name.put(9346567889L, "Dhanu");
        Name.put(9745567889L, "Kaju");

        System.out.println("The keys of the given treemap is" + Name.keySet());
        System.out.println("The values of the given treemap is" + Name.values());
        System.out.println("The key/value pair is" + Name.entrySet());

        email.put(9356579876L, "sanketmahadik@gmail.com");
        email.put(9478987656L, "tunutmahadik@gmail.com");
        email.put(9878987656L, "yahaoomahadik@gmail.com");
        email.put(9778987656L, "starbuccs375@gmail.com");
        email.put(9978987656L, "macd67@gmail.com");
        email.put(9678987656L, "area34@gmail.com");

        System.out.println("The keys of the given treemap is" + email.keySet());
        System.out.println("The values of the given treemap is" + email.values());
        System.out.println("The key/value pair is " + email.entrySet());

    }


}
