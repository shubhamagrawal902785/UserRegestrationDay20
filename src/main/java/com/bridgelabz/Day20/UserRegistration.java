package com.bridgelabz.Day20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class UserRegistration {

        static boolean Name(String str1){
                boolean b1 = Pattern.compile("^[A-Z]{1}[A-Za-z]{2,}$").matcher(str1).matches();
                return b1;
        }

        static boolean Last(String str2){
                boolean b2 = Pattern.compile("^[A-Z]{1}[A-Za-z]{2,}$").matcher(str2).matches();
                return b2;

        }

        static boolean Email(String str3){
                boolean b3 = Pattern.compile("^[A-Za-z0-9]+[@][a-zA-Z]+[.][a-zA-Z]+[.]?[a-zA-Z]{2}$").matcher(str3).matches();
                return b3;

        }

        static boolean Phone(String str4){
                boolean b4 = Pattern.compile("^(91)[-.+]{1}[1-9]{1}[0-9]{9}$").matcher(str4).matches();
                return b4;
        }
}