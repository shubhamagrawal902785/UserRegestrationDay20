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
}