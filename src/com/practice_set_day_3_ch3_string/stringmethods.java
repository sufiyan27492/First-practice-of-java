package com.practice_set_day_3_ch3_string;
public class stringmethods {
    public static void main(String[] args) {
        String name = "SUFiyan    ";
        System.out.println("name is: "+ name);

        int value = name.length();
        System.out.println("length is: "+value);

        String value1 = name.toLowerCase();
        System.out.println("in lower case: "+value1);

        String value2 = name.toUpperCase();
        System.out.println("in upper case: "+value2);

        //it remove spaces
        String value3 = name.trim();
        System.out.println("trim name: "+value3);

        //it removes a words or spacese where you want
        String value4 = name.substring(6,8);
        String value5 = name.substring(7);
        System.out.println("take string between 6 to 8 only : "+value4);
        System.out.println("begain with 7 befor that all removes: "+value5);

        //replace alphabet,char,line,words,and values
        String value6 = name.replace("SUF","DUP");
        String value7 = name.replace('F','B');
        System.out.println("replce SUF: "+value6);
        System.out.println("replace only F: "+value7);

        // use for finding starting and endig
        boolean value8 = name.startsWith("iy");
        boolean value9 = name.startsWith("SUF");
        boolean value10 = name.endsWith("yan");
        boolean value11 = name.endsWith("   ");

        System.out.println("name starts With iy : "+value8);
        System.out.println("name starts With SUF : "+value9);
        System.out.println("name ends With yan : "+value10);
        System.out.println("name ends With black space: "+value11);

        char value12 = name.charAt(2);
        System.out.println("char at 2 position : "+value12);

        int value13 = name.indexOf("an");
        int value14 = name.indexOf("yan",3);
        // if you need to start searching from last
        int value15 = name.lastIndexOf('n');
        int value16 = name.lastIndexOf("iy",9);
        System.out.println("position of (an) in string is: "+value13);
        System.out.println("if i start serching (yan) from index 3 so (y) is getting at: "+value14);
        System.out.println("char (n) position from last is: "+value15);
        System.out.println("str (iy) position from index (9) is: "+value16);

        boolean value17 = name.equals("SUFiyan    ");
        boolean value18 = name.equals("sufiyan    ");
        boolean value19 = name.equalsIgnoreCase("sufiyan    ");
        System.out.println("name is equals to (SUFiyan    ): "+value17);
        System.out.println("name is equals to (sufiyan    ): "+value18);
        System.out.println("name is equal if we use ignore case: "+value19);


    }
}
