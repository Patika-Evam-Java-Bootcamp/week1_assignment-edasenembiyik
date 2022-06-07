package com.patika;

import java.util.Scanner;

public class Main {

    String s1 = "Welcome";  //1st object
    String s2 = "Welcome";  //2nd object
    String s3 = "Welcome";  //3rd object

    //Totally, creating 1 object and 3 variables pointing to that object as a reference

    static String str = "code";
    //Created static and String data type variable. the value of variable is  <<code>>


    static String[] stringArray = new String[5];
    //Created a string with 5 different values

    public static String checking(String[] stringArr) {
        for (String value : stringArr) {
            if (value.contains(str)) {
                return value;
            }
        }
        return null;
    }

    // A method has been written that checks whether the array contains str String or not.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            stringArray[i] = input.next();
        }
        if ((checking(stringArray) != null)) {
            System.out.println("Tanımlı value yu içeren String deger: " + checking(stringArray));
        }

    }
}

//Data is received from the user and the method is called.

